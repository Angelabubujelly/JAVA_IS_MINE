package itsMine;

import java.util.Scanner;

public class Tennn {

	public static void main(String[] args) {
		int input ;
		//1~100임의의 수 추출 저장
		int answer = (int) Math.random()	;
		Scanner sc = new Scanner(System.in);
		boolean run = true;
			
			do {
				
					System.out.println("1~100사이 정수 맞추삼");
					input = sc.nextInt()	;
					
			} while (run); 

			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도하세요");
				
			} else if (input < answer)  {
				System.out.println("더 큰 수로 다시 시도하세요");
			
			} else if (input == answer) {
			
			System.out.println("정답입니다.");
		
			}
			
					

		}
	}


