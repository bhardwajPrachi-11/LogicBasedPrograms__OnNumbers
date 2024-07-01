package com.daily.examples.numbers;

import java.util.Scanner;

public class PrimeNumberOrNot {
	public static int isPrime(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int count = isPrime(num);
		if(count == 2) {
			System.out.println("Prime Number " + num);
		}else {
			System.out.println("Not a prime number " + num);
		}
		sc.close();
	}

}
