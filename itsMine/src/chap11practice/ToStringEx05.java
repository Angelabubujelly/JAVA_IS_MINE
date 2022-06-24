package chap11practice;

import java.util.Date;

public class ToStringEx05 {

	public static void main(String[] args) {
		Object obj = new Object();
		
		// .toString()	 을 호출하면 클래스이름@해시코드 리턴해줌.
		System.out.println(obj.toString());
		//객체변수를 호출하면 .toStirng()이 생략된것이다.
		
		//객체 변수를 호출하면 . toString()이 생략된 것이다.
		System.out.println(obj);//.toString 안 붙여도 자동으로 붙어 출력됨.
		
		String str = new String("홍길동"); 
		// .toString()을 오버라이딩 해서 홍길동이 나옴!
		System.out.println(str.toString());
		System.out.println(str);
 
Date date = new Date();
System.out.println(date); //얘도 .toString오버라이딩 되고 생략 된거임.
	}

}
