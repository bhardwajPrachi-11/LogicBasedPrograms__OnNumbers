package com.daily.examples.numbers;

import java.util.Scanner;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		for(int i=1;i<=n1;i++) {
			int gcd1=0;
			if(n1%i==0) {
				if(gcd1<i) {
					gcd1=i;
				}
				System.out.println(gcd1);
			}
			
		}
		
		for(int i=1;i<=n2;i++) {
			int gcd2=0;
			if(n2%i==0) {
				if(gcd2<i) {
					gcd2=i;
				}
				System.out.println(gcd2);
			}
			
		}
	}

}
