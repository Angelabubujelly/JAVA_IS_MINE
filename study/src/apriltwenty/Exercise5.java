package apriltwenty;

public class Exercise5 {

	public static void main(String[] args) {
		// // 중첩for문을 이용해 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)로 출력. 단 x와 y는 10이하이다.


		
		for (int x = 1; x<=10; x++) {
			for (int y =1; y<=10; y++) {
				if((4*x)+(5*y) == 60)
					System.out.println("(" + x + ")" + y);
			}
		}
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	}

}
