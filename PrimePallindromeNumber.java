package com.daily.examples.numbers;

import java.util.Scanner;

public class PrimePallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num;
		int revPrime = isPrime(num);
		if(revPrime == temp) {
			System.out.println("Prime pallindrome");
		}
		else {
			System.out.println("Not Prime Pallindrome");
		}
		
		sc.close();
	}

	private static int isPrime(int num) {
		int count = 0;
		int revPrime = 0;;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			revPrime = rev(num);
		}
		return revPrime;
	}

	private static int rev(int num) {
		int reverse = 0;
		while(num!=0) {
			int n1 = num%10;
			reverse = reverse*10+n1;
			num = num/10;
		}
		return reverse;
	}

}
