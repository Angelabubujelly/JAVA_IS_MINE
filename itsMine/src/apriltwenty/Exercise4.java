package apriltwenty;

public class Exercise4 {

	public static void main(String[] args) {
		/*While 문과 Math.random()메소드를 이용해서 두개의 주사우ㅣ를 던졌을 때
		 * 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
		 * 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드.
		 * 
		 * (1.4),(4,1),(2,3),(3,2)
		 * 
		 */
		while (true) {
		int num1 = (int)(Math.random()*6+1);
		int num2 = (int)(Math.random()*6+1);
		
		System.out.println("(" + num1 + " , " + num2 + ")");
		

			if	(num1 + num2  == 5 )
			break;
		}

		

	}

}
