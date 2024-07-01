package com.daily.examples.numbers;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int range = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=range;i++) {
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				sum = sum + i;
			}
		}
		System.out.println("Sum is : " + sum);
		sc.close();
	}

}
