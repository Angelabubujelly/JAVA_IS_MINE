package class06;

import java.util.Scanner;

public class Method01 {

	int num1 =31;
	int num2 = 20;
	String name;
	boolean bool;
	double numDou;
	double result;
	
	// 이제 메소드 반환형이 정수인 것을 선언하겠어용..
	
	 int add() { //서로의 자료형이 같아야 함... int int 같아용ㅇ요
		 int sum =num1 + num2;
		 return  sum;
	 }
		 
		 double divide() {
			numDou = (double)num2 / num1;
		 return numDou;
		 }
	 
		 boolean com() {
			 if(num1>num2)
				 bool = true;
			 else
				 bool =false;
			 return bool;
		 }
		 
		 String methodStr() {
			 for(int i = 1; i<=10; i++) {
				 name = "밤블비" + i;
				 System.out.println(name);
			 }
		 
			 return name;
		 }
		 
		 int sum1() {
			 int sum1 = 0;
			 for(int i =1; i<=100; i++) {
				 if(i%2 ==0)
					 sum1 += i; 
			 }
			 return sum1;
		 }
		 
		 void  void1() {
			 Scanner scan = new Scanner(System.in);
			 System.out.println("연산자 입력 :" );
			 String op = scan.next();
			 
			
			 switch (op) {
			 case "+" :
				System.out.println("합계 = " + num1 + num2);
				break;
			 case "-" :
				 System.out.println("뺄셈 결과 = " + (num1 - num2));
				 break;
			 case "*" :
				 System.out.println("곱셈 결과 = " + (num1 * num2));
				 break;
			 case "%" :
				 System.out.println("나머지 = "+ num1 %num2);
			 break;
			 case "/":
			 System.out.println("몫 = "+ num1 / num2);
			 }
		 }
			 
			 
			 String  void2() {
				 Scanner scan = new Scanner(System.in);
				 System.out.println("연산자 입력 :" );
				 String op2 = scan.next();
				 
				
				 switch (op2) {
				 case "+" :
					System.out.println("합계 = " + num1 + num2);
					break;
				 case "-" :
					 System.out.println("뺄셈 결과 = " + (num1 - num2));
					 break;
				 case "*" :
					 System.out.println("곱셈 결과 = " + (num1 * num2));
					 break;
				 case "%" :
					 System.out.println("나머지 = "+ num1 %num2);
				 break;
				 case "/":
				 System.out.println("몫 = "+ num1 / num2);
				 }
				 return"프로그램 끝";
				 //리턴 값 없으면 걍 void 하셈
		 }
}
