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
			System.out.println("ID�� �Է��ϼ��� : ");
			userID = sc.nextInt();
			System.out.println("��й�ȣ�� �Է��ϼ��� : ");
			userPW = sc.nextInt();
			
			if(id == userID && pw == userPW) {
				System.out.println("�α��� ����");
				check = true;
				break;
			} else if ( id != userID|| pw != userPW){
			
				if(i==3) {
					System.out.println("�α��ο� �����߽��ϴ�. ���α׷��� ����˴ϴ�.");
				} else
			
			System.out.println("ID Ȥ�� PASSWORD�� Ʋ�Ƚ��ϴ�.");
			
			}
			} 	
		        
		        while (check) {

					System.out.println("");
					System.out.println("1. �л� ���� �Է�");
					System.out.println("2. �л� ���� ���");
					System.out.println("3. �л� ��� ���");
					System.out.println("4. ���α׷� ����");
					
					selectNo = sc.nextInt();
					

					if(selectNo == 1){
								
								System.out.println("�̸� �Է�");
								
								name = sc.next();
								
								System.out.println("���� �Է�");
								
								kor = sc.nextInt();
								
								System.out.println("���� �Է�");
								
								eng = sc.nextInt();
								
								System.out.println("���� �Է�");
								
								math = sc.nextInt();
						
							}else if(selectNo == 2){
						
								sum = kor + math + eng ;
								System.out.println(name + "�� ���� : " + sum );

							}else if(selectNo == 3){
								
								avr = (double)(sum) /3 ;
								System.out.printf("%s�� ��� : %.2f\n", name, avr);
								
							}
					
							else if (selectNo == 4) {
								
								System.out.println("���α׷��� �����մϴ�.");
								check = false;
								  break;
								
							}
						}
		       
		 

		}
}