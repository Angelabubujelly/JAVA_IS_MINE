package itsMine;

import java.util.Scanner;

public class Tennn {

	public static void main(String[] args) {
		int input ;
		//1~100������ �� ���� ����
		int answer = (int) Math.random()	;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
			
			do {
				
					System.out.println("1~100���� ���� ���߻�");
					input = sc.nextInt()	;
					
			} while (run); 

			if (input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��ϼ���");
				
			} else if (input < answer)  {
				System.out.println("�� ū ���� �ٽ� �õ��ϼ���");
			
			} else if (input == answer) {
			
			System.out.println("�����Դϴ�.");
		
			}
			
					

		}
	}


