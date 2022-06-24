package day1;

public class Array3 {

	public static void main(String[] args) {
		/*홀수 가로는 증가
		짝수 가로는 감소*/


		int[][] arr = new int[5][5];
		int num = 0; 

		for(int i=0; i<arr.length; i++){
		if(i%2==0){
		for(int j=0; j<arr[i].length; j++){
		arr[i][j] = num;
		++num;
		}
		} else {
		for(int j=arr[i].length-1; j>=0; j--){
		arr[i][j]= num;
		++num;}
		}
		}
		for(int i=0; i<arr.length; i++){
		for(int j=0; j<arr[i].length; j++){
		System.out.printf("%5d ", arr[i][j]);}
		System.out.println();
		}
		}
		} 