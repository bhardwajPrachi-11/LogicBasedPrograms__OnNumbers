package com.daily.examples.numbers;

import java.util.Scanner;

public class PerfectNumberInGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int range = sc.nextInt();
		for(int i=1;i<=range;i++) {
			int sum = 1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					sum = sum+j;
				}
			}
			if(sum == i) {
				System.out.println(i +" is perfect number");
			}
			
		}
		sc.close();
	}

}
