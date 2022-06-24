package itsMine;

public class IfDiceExam {

	public static void main(String[] args) {
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
