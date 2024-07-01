package com.daily.examples.numbers;

import java.util.Scanner;

public class StrongNumberInGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to check for strong number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			int temp = i;
			int digitSum = digit(i);
			if(digitSum==temp) {
				System.out.println(temp + " is strong number");
			}
		}
		sc.close();
	}

	private static int digit(int num) {
		int sum = 0;
		while(num!=0) {
			int n = num%10;
			int fact = fact(n);
			sum  = sum+fact;
			num = num/10;
		}
		return sum;
	}

	private static int fact(int n) {
		int factorial = 1;
		for(int i=1;i<=n;i++) {
			factorial = factorial*i;
		}
		return factorial;
	}
}
