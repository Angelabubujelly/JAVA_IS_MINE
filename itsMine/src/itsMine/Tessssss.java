package itsMine;

import java.util.Scanner;

public class Tessssss {

	public static void main(String[] args) {
		int input = 0;
		
		int answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1~100���� ���� ���߽ÿ�");
			input = sc.nextInt();
			if (answer < input)
				System.out.println("�� ���� ����,..");
			else if (answer > input)
			System.out.println("�� ū����..");
		} while (answer != input);
		System.out.println("�����Դϴ�.");
		int[][] score = new int[3][4];
		int num = -1;
	
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; i<score[i].length;j++) { 
				score[i][j] = num +=2;
				System.out.print(score[i][j] + ", ");
			}
			System.out.println();
		}
	}

}
