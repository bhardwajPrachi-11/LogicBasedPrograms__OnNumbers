package com.daily.examples.numbers;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num;
		int revNumber = rev(num);
		if(revNumber == temp) {
			System.out.println("Number is pallindrome");
		}else {
			System.out.println("Not a pallindrome number");
		}
		sc.close();
	}

	private static int rev(int num) {
		int reverse = 0;
		while(num!=0) {
			int n = num%10;
			reverse = reverse*10+n;
			num = num/10;
		}
		return reverse;	
	}
}
