package itsMine;

import java.util.Scanner;

public class Tessssss {

	public static void main(String[] args) {
		int input = 0;
		
		int answer = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1~100까지 정수 맞추시오");
			input = sc.nextInt();
			if (answer < input)
				System.out.println("더 작은 수로,..");
			else if (answer > input)
			System.out.println("더 큰수로..");
		} while (answer != input);
		System.out.println("정답입니다.");
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
