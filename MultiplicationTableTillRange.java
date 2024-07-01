package com.daily.examples.numbers;

import java.util.Scanner;

public class MultiplicationTableTillRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int range = sc.nextInt();
		for(int i=1;i<=range;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println("==================");
		}
		sc.close();
	}

}
