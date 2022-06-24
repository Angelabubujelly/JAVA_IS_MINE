package first;

	import java.util.Scanner;

	public class Te1{
		
		public static void main(String[] args){
		String name = null;
		boolean check = false;
		int kor = 0;;
		int eng =0;
		int math = 0;
		int sum = 0;
		int userID = 0;
		int userPW = 0;
		double avr = 0.0;
		int id = 1111;
		int pw = 0000;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<=3; i++) {
			System.out.println("ID를 입력하세요 : ");
			userID = sc.nextInt();
			System.out.println("PASSWORD를 입력하세요 : ");
			userPW = sc.nextInt();
			
			if(id == userID && pw == userPW) {
				System.out.println("로그인 성공");
				check = true;
				break;
			} else if ( id != userID|| pw != userPW){
			
				if(i==3) {
					System.out.println("로그인에 실패했습니다. 본인확인 필요.");
					System.out.println("프로그램 종료");
				} else
			
			System.out.println("ID 혹은 PASSWORD가 틀렸습니다.");
			
			}
			} 	
			while (check) {
				System.out.println("");
				System.out.println("1. 학생 정보 입력");
				System.out.println("2. 학생 총점 출력");
				System.out.println("3. 학생 평균 점수");
				System.out.println("4. 프로그램 종료");
				int select = sc.nextInt()	;
				
				switch(select) {
				case 1:
					System.out.println("이름 입력");
					
					name = sc.next();
					
					System.out.println("국어 입력");
					
					kor = sc.nextInt();
					
					System.out.println("영어 입력");
					
					eng = sc.nextInt();
					
					System.out.println("수학 입력");
					
					math = sc.nextInt();
					break;
					
				case 2:
					sum = kor + math + eng;
					System.out.println(name + "의 총점 : " + sum );
					break;
					
				case 3:
					
					avr = (double)(sum) /3;
					System.out.println(name + "의 평균 : " + avr );
					System.out.printf("%s의 평균 : %.2f\n", name, avr);
					break;
					
				case 4:
					System.out.println("프로그램 종료");
					check = false;
					
				}
				
				
			}
			}
			
			
		}
		
		
		
	


