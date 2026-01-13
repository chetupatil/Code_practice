package main.java.program;

import java.util.Scanner;

public class SumOfDigitNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		long n = sc.nextLong();
		long mod = 0;
		long sum = 0;
		while(n>0) {
			mod = n%10;
			n=n/10;
			sum+=mod;
		}
		System.out.println("Sum of the number : "+sum);
	}
}
