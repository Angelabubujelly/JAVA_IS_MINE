package apriltwenty;

public class Exercise5 {

	public static void main(String[] args) {
		// // ��øfor���� �̿��� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x,y)�� ���. �� x�� y�� 10�����̴�.


		
		for (int x = 1; x<=10; x++) {
			for (int y =1; y<=10; y++) {
				if((4*x)+(5*y) == 60)
					System.out.println("(" + x + ")" + y);
			}
		}
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		
	}

}
