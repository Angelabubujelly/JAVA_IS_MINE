package baekjoon;

import java.util.Scanner;

public class Sprout_2739 {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	        if (N%4==0&&N%100!=0)
	       System.out.println("0");
	        else
	        	System.out.println("1");
	           
	}

}
