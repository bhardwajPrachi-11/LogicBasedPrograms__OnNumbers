package com.daily.examples.numbers;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("value of a after swapping : " + a);
		System.out.println("value of b after swapping : " + b);
		sc.close();
	}
}
