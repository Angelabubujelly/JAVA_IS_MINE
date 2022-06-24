package itsMine;

import java.util.Scanner;

public class Hum {

	public static void main(String[] args) {


		
		int input = 0;
		
		int answer = (int)(Math.random()*100)+1 ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1~100사이의 정수를 맞춰주세요:");
					input = sc.nextInt();
		if (answer> input) 
			System.out.println("더 큰 수로 다시 시도해보세요.");
		 else if (answer < input) 
			System.out.println("더 작은 수로 다시 시도해보세요");
		} while (answer != input); 
		System.out.println("정답입니다.");
	
	}
}
