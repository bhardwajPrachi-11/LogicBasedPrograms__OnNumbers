package com.daily.examples.numbers;

import java.util.Scanner;

public class Print1toN__Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
