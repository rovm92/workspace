/* 예외처리: 조건문을 사용해서 예외 처리하는 경우
 * => 메서드를 호출할 때 마다 그 리턴 값을 검사해야 한다.
 * => 메서드를 사용하는 코드안에
 *    일을 시키는 코드와 예외를 처리하는 코드가 섞여 있어
 *    유지보수가 어려워진다.
 * => 리턴 값이 유효한 값일 경우도 있다.
 *    그런 경우를 처리할 수 없다.
 * */
package step17;

public class Test02 {
  
  public static float divide(float a , float b){
    if(b==0){
      return -121255f;
    }
    return a/b;
  }
  public static void main (String[] args) {
    float result = divide(10,2);
    if(result == -121255f){
      System.out.println("0으로 나눌수 없습니다.");
    } else{
      System.out.println(result);
    }
    
    result = divide(10,0);
    if(result == -121255f){
      System.out.println("0으로 나눌수 없습니다.");
    } else{
      System.out.println(result);
    }
    
    result = divide(121255,-1);
    if(result == -121255f){
      System.out.println("0으로 나눌수 없습니다.");
    } else{
      System.out.println(result);
    }
  }
}
