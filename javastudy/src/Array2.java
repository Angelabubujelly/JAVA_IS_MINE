package day1;

public class Array2 {

	public static void main(String[] args) {
		
		//(i+1)+(5*j)
		
		int [][] arr = new int[5][5]; 

		for(int i=0; i<arr.length; i++){
		for(int j=0; j<arr[i].length; j++){
		arr[i][j] = (i+1) + 5*j;
		}
		}
		for(int i=0; i<arr.length; i++){
		for(int j=0; j<arr[i].length; j++) {
		System.out.printf("%5d ", arr[i][j]);
		}
		System.out.println();
		}
		}
	

}
