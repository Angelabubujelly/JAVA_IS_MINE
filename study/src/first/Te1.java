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
			System.out.println("ID�� �Է��ϼ��� : ");
			userID = sc.nextInt();
			System.out.println("PASSWORD�� �Է��ϼ��� : ");
			userPW = sc.nextInt();
			
			if(id == userID && pw == userPW) {
				System.out.println("�α��� ����");
				check = true;
				break;
			} else if ( id != userID|| pw != userPW){
			
				if(i==3) {
					System.out.println("�α��ο� �����߽��ϴ�. ����Ȯ�� �ʿ�.");
					System.out.println("���α׷� ����");
				} else
			
			System.out.println("ID Ȥ�� PASSWORD�� Ʋ�Ƚ��ϴ�.");
			
			}
			} 	
			while (check) {
				System.out.println("");
				System.out.println("1. �л� ���� �Է�");
				System.out.println("2. �л� ���� ���");
				System.out.println("3. �л� ��� ����");
				System.out.println("4. ���α׷� ����");
				int select = sc.nextInt()	;
				
				switch(select) {
				case 1:
					System.out.println("�̸� �Է�");
					
					name = sc.next();
					
					System.out.println("���� �Է�");
					
					kor = sc.nextInt();
					
					System.out.println("���� �Է�");
					
					eng = sc.nextInt();
					
					System.out.println("���� �Է�");
					
					math = sc.nextInt();
					break;
					
				case 2:
					sum = kor + math + eng;
					System.out.println(name + "�� ���� : " + sum );
					break;
					
				case 3:
					
					avr = (double)(sum) /3;
					System.out.println(name + "�� ��� : " + avr );
					System.out.printf("%s�� ��� : %.2f\n", name, avr);
					break;
					
				case 4:
					System.out.println("���α׷� ����");
					check = false;
					
				}
				
				
			}
			}
			
			
		}
		
		
		
	


