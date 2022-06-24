package first;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	
		
		String name = null;
		int id = 1111;
		int pw =0000 ;
		int selectNo = 0;
		int kor = 0;;
		int eng =0;
		int math = 0;
		int sum = 0;
		int userID = 0;
		int userPW = 0;
		double avr = 0;
		
		boolean check = false;  
		
		for (int i = 0; i<=3; i++) {
			System.out.println("ID를 입력하세요 : ");
			userID = sc.nextInt();
			System.out.println("비밀번호를 입력하세요 : ");
			userPW = sc.nextInt();
			
			if(id == userID && pw == userPW) {
				System.out.println("로그인 성공");
				check = true;
				break;
			} else if ( id != userID|| pw != userPW){
			
				if(i==3) {
					System.out.println("로그인에 실패했습니다. 프로그램이 종료됩니다.");
				} else
			
			System.out.println("ID 혹은 PASSWORD가 틀렸습니다.");
			
			}
			} 	
		        
		        while (check) {

					System.out.println("");
					System.out.println("1. 학생 정보 입력");
					System.out.println("2. 학생 총점 출력");
					System.out.println("3. 학생 평균 출력");
					System.out.println("4. 프로그램 종료");
					
					selectNo = sc.nextInt();
					

					if(selectNo == 1){
								
								System.out.println("이름 입력");
								
								name = sc.next();
								
								System.out.println("국어 입력");
								
								kor = sc.nextInt();
								
								System.out.println("영어 입력");
								
								eng = sc.nextInt();
								
								System.out.println("수학 입력");
								
								math = sc.nextInt();
						
							}else if(selectNo == 2){
						
								sum = kor + math + eng ;
								System.out.println(name + "의 총점 : " + sum );

							}else if(selectNo == 3){
								
								avr = (double)(sum) /3 ;
								System.out.printf("%s의 평균 : %.2f\n", name, avr);
								
							}
					
							else if (selectNo == 4) {
								
								System.out.println("프로그램을 종료합니다.");
								check = false;
								  break;
								
							}
						}
		       
		 

		}
}