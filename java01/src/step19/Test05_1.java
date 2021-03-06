/* 멀티태스킹 : critical section(critical region)
 * => 클리티컬 섹션을 실행할 때,
 *  한 번에 한 스레드 만이 진입하게 만드는 방법
 *  "synchronized"로 영역을 표시하라!
 *  
 * => 용어
 *  "뮤택스"
 *  => 크리티컬 섹션에 한 번에 한 스레드만 진입하게 만드는 것.
 *  => Semaphore(1)
 *  => 일상 생활에서 상호 배제를 하는 예: 선풍기의 속도 조절, 라이오 채널 변경등
 *  
 *  "세마포어"
 *   => 크리티컬 섹션에 지정된 개수만큼 스레드가 진입하게 만다는 것.
 *   => Semaphore(n)
 *   => 자바에서는 이 방식을 지원하지 않는다. 오직 뮤택스만 존재한다.
 **/
package step19;

public class Test05_1 {

  static class Account extends Thread{
    long balance;

    public Account(long balance){
      this.balance = balance;
    }

    synchronized public long withdraw(long money){
      long temp = this.balance;

      temp -= money;

      if(temp >= 0){
        this.balance = temp;
        return money;
      }
      return 0;          
    }
  }

  public static class ATM extends Thread {
    Account account;

    public ATM(String name, Account account){
      super(name);
      this.account = account;
    }

    public void run(){
      long sum = 0;
      for(int i = 0; i< 10000; i++){
        long money = this.account.withdraw(100);
        if(money==0)
          break;
        sum += money;
      }
      System.out.printf("%s = %d\n",this.getName(), sum);
    }
  }

  public static void main(String[] args) {
    Account account = new Account(1000000);
    ATM t1 = new ATM("강남",account);
    ATM t2 = new ATM("강북",account);
    ATM t3 = new ATM("강원",account);
    ATM t4 = new ATM("제주",account);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
