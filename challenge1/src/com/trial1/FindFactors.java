package com.trial1;

public class FindFactors {

	public static void main(String[] args) {
		findFactors(20);
	}

	public static void findFactors(int n) {
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				n = n / i;
				System.out.println(i);
			} else
				i++;
		}
	}
}
