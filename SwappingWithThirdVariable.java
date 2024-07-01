package com.daily.examples.numbers;

import java.util.Scanner;

public class SwappingWithThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int c;
		 c = a+b; //1+2=3
		 a = c-a;
		 b = c-b;
		 
		 System.out.println("Value of a after swapping " + a);
		 System.out.println("Value of b after swapping " + b);
		 sc.close();
	}
}
