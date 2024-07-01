package com.daily.examples.numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0) {
			int n = num%10;
			rev = rev*10+n;
			num = num/10;
		}
		System.out.println("Reverse of given number : " + rev);
		sc.close();
	}

}
