/*  컬렉션 클래스 II: java.lang.HashSet
 *  => 저장하려는 객체데 대해 hashCode()를 호출하여 
 *    그 리턴 값을 가지고 저장할 위치를 계산한다.
 */
package step08;

import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test07_9 {
  static class MyKey {
    String value;

    public MyKey(String value){
      this.value += value;
    }
  }
  
  
  static class Book {
    String title;
    String press;
    int page;
    
    public Book(String title, String press, int page){
      this.title = title;
      this.press = press;
      this.page = page;
    }
  
  public String toString(){
    return String.format("%s,%s,%d", title, press, page);
  }
  
 }
  public static void main(String[] args) {
     HashMap map = new HashMap();
     /* put(key, value)
      * => key 객체: key 객체의 hashCode() 리턴 값을 사용하여
      *    value를 저장할 때 사용할 위치를 계산한다.
      * => 그래서 key객체는 같은 값을 가진 객체인 경우
      *    같은 hashCode()를 리턴하는 클래스를 사용한다.
      *    예) String, 랩퍼 클래스(Byte, Short, Integer, Long, Double, Float, Char, Boolean)
      * -> value 객체: Map 컬렌션에 보관될 값
      * */
     
     map.put(new MyKey("key1"), new Book("aaa","비트출판사",100));
     map.put(new MyKey("key2"), new Book("bbb","비트출판사",200));
     map.put(new MyKey("key3"), new Book("ccc","비트출판사",300));
     map.put(new MyKey("key4"), new Book("ddd","비트출판사",400));
    
     System.out.println(map.get(new String("key1")));
     System.out.println(map.get(new String("key3")));
     // 같은 값을 갖고 있는 MyKey를 사용햇는데 값을 꺼낼수 없었다 이유는?
     // => 인스턴스 변수의 값이 중요한 게 아니라, hasCode()의 리턴 값과,
     //   equlas()의 리턴 값이 중요하다.
     // => 같은 값을 갖고 있는 객체임에도 다른 hashCode()를 리턴하는 클래스는
     //   Map컬렌션의 key로 사용할 수 없다.
     // => 개발자가 정의한 클래스를 Map컬렉션의 key 로 쓰고 싶은가?
     // 그렇다면 hachCode() equals()를 오버라이딩해라!

     MyKey s1 = new MyKey("key1");
     MyKey s2 = new MyKey("key1");
     if(s1==s2)
       System.out.println("s1==s2");
     else
       System.out.println("s1!=s2");
     System.out.printf("%d, %d\n", s1.hashCode(), s2.hashCode());
     System.out.println(s1.equals(s2));
   }
}
