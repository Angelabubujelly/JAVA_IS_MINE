package itsMine;

import java.util.Scanner;

public class Hum {

	public static void main(String[] args) {


		
		int input = 0;
		
		int answer = (int)(Math.random()*100)+1 ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1~100������ ������ �����ּ���:");
					input = sc.nextInt();
		if (answer> input) 
			System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
		 else if (answer < input) 
			System.out.println("�� ���� ���� �ٽ� �õ��غ�����");
		} while (answer != input); 
		System.out.println("�����Դϴ�.");
	
	}
}
