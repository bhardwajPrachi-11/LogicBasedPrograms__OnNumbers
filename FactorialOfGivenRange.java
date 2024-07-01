package com.daily.examples.numbers;

import java.util.Scanner;

public class FactorialOfGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range ");
		int range = sc.nextInt();
		for(int i=1;i<=range;i++) {
			int fact = 1;
			for(int j=1;j<=i;j++) {
				fact = fact*j;
			}
			System.out.println("factorial of " + i + " = " + fact);
		}
		sc.close();
	}

}
