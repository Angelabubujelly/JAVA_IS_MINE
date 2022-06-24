package itsMine;

import java.util.Scanner;

public class Routine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("기상시간: ");
		
		int time = scan.nextInt();
		

		
		System.out.println("피로도는?");
		
		int tiredness = scan.nextInt();
		
		if( (time <=7) && (tiredness <5) ) {
			System.out.println("아침먹고 운동하기.");
		} else if( (time <=8) && (tiredness <5) ){
			System.out.println("시리얼먹구 운동");
		}else if ((time <= 9) && (tiredness >5) ){
			System.out.println("시리얼만이라두 냠");
		} else  {
			System.out.println("상상도 못할 블랙아웃");
		}
	}

}
