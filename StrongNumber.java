package com.daily.examples.numbers;

import java.util.Scanner;

public class StrongNumber {
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check");
		int num = sc.nextInt();
		int temp = num;
		int factorial;
		int sum = 0;
		
		while(num!=0) {
			int n=num%10;
			factorial = fact(n);
			sum = sum+factorial;
			num = num/10;
		}
		if(sum == temp) {
			System.out.println(temp + " is a strong number");
		}else {
			System.out.println("Not a strong number");
		}
		sc.close();
	}
	
}
