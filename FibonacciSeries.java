package com.daily.examples.numbers;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter series range");
		int range = sc.nextInt();
		int a = 0;
		System.out.println(a);
		int b = 1;
		System.out.println(b);
		int c;
		for(int i=2;i<=range;i++) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
//			if(c<=range) {
//				System.out.println(c);
//				a=b;
//				b=c;
//			}
			
		}
		sc.close();
	}

}
