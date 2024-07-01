package com.daily.examples.numbers;

import java.util.Scanner;

public class ArmstrongNumberInGivenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int range = sc.nextInt();
		for(int i=1;i<=range;i++) {
			int checkArmstrong = checkArmstrong(i);
			int temp = i;
			if(checkArmstrong == temp) {
				System.out.println(checkArmstrong + " is Armstrong Number");
			}
		}
		sc.close();
	}

	private static int checkArmstrong(int num) {
		int countDigit = countDigit(num);
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			sum = sum+powerProd(digit, countDigit);
			num = num/10;
		}
		return sum;
	}

	private static int powerProd(int digit, int count) {
		int power=1;
		while(count!=0) {
			power  = power*digit;
			count--;
		}
		return power;
	}

	private static int countDigit(int num) {
		int count = 0;
		while(num!=0) {
			count++;
			num = num/10;
		}
		return count;
	}
}
