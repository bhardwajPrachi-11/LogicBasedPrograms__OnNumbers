package com.daily.examples.numbers;

import java.util.Scanner;

public class FIbonacciSeriesofGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<=num;i++) {
			int c=a+b;
			if(c<=num) {
				System.out.println(c);
				a=b;
				b=c;
			}
		}
		sc.close();
	}
}
