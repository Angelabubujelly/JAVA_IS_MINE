package itsMine;

import java.util.Scanner;

public class Routine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���ð�: ");
		
		int time = scan.nextInt();
		

		
		System.out.println("�Ƿε���?");
		
		int tiredness = scan.nextInt();
		
		if( (time <=7) && (tiredness <5) ) {
			System.out.println("��ħ�԰� ��ϱ�.");
		} else if( (time <=8) && (tiredness <5) ){
			System.out.println("�ø���Ա� �");
		}else if ((time <= 9) && (tiredness >5) ){
			System.out.println("�ø����̶�� ��");
		} else  {
			System.out.println("��� ���� ���ƿ�");
		}
	}

}
