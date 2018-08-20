package com.trial1;

public class SmithNumber {

	public static void main(String[] args) {
		int sumOfDigits = sumOfDigits(58);
		int sumOfPrimeFactorials = sumOfPrimeFact(58);
		if(sumOfDigits == sumOfPrimeFactorials)
			System.out.println("Smith Number...");
		else
			System.out.println("NOT Smith Number...");
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	public static int sumOfPrimeFact(int n) {
		int sum1 = 0, i = 2;
		while (n > 1) {
			if (n % i == 0) {
				sum1 = sum1 + sumOfDigits(i);
				System.out.println(i);
				n = n / i;
			} else {
				i++;
			}
		}
		return sum1;
	}
}
