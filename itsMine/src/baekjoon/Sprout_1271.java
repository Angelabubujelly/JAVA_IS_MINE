package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Sprout_1271 {

	public static void main(String[] args) {

//	BigInteger Bignumber = new BigInteger("9230487298219412412412412412214124241241241242142141242124129481948294");
/*
		System.out.println("µ¡¼À(+) :" +bigNumber1.add(bigNumber2));
		System.out.println("»¬¼À(-) :" +bigNumber1.subtract(bigNumber2));
		System.out.println("°ö¼À(*) :" +bigNumber1.multiply(bigNumber2));
		System.out.println("³ª´°¼À(/) :" +bigNumber1.divide(bigNumber2));
		System.out.println("³ª¸ÓÁö(%) :" +bigNumber1.remainder(bigNumber2)); 
																													*/
		
		Scanner sc = new Scanner(System.in);
    BigInteger a = sc.nextBigInteger();
    BigInteger b = sc.nextBigInteger();
    sc.close();
    System.out.println(a.divide(b));
    System.out.println(a.remainder(b));
	
	
	}

}