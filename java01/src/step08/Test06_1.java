/*  컬렉션 클래스: 사용 전 - 배열을 사용한다.
*/
package step08;

import java.sql.Date;

public class Test06_1 {

  public static void main(String[] args) {
    // Date 인스턴스의 주소를 최대 3개 저장할 수 있다.
    Object[] dateList = new Date[3];
    
    dateList[0] = Date.valueOf("2017-3-1");
    dateList[1] = Date.valueOf("2017-5-3");
    dateList[2] = Date.valueOf("2017-5-5");
    
    // 배열의 문제는 인스턴스를 배열 크기 만큼만 저장할 수 있다.
    // 더 추가로 저장하고 싶다면, 새 배열을 만들어야 한다.
    dateList = growArray(dateList, 2);
    
    dateList[3] = Date.valueOf("2017-5-9");
    dateList[4] = Date.valueOf("2017-6-6");
    
    for(Object obj : dateList){
      System.out.println(obj);
    }
  }
  public static Object[] growArray(Object[] arr, int size){
    Object [] newArr = new Object[arr.length + size];
    for(int i=0; i<arr.length; i++){
      newArr [i] = arr[i];
    }
    return newArr;
  }
}
