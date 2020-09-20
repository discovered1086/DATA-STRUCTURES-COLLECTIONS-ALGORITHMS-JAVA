package com.kingshuk.datatstructuresalgorithms;

public class GCDAlgorithmHarness {

	public static void main(String[] args) {
		int x = 450;
		int y = 51;
		System.out.println("GCD of " + x + " and " + y + " is: " + getGCD(x, y));
	}

	public static int getGCD(int x, int y) {
		int gcd = 0;
		int r = 10000;

		while (r != 0) {
			if (y > x) {
				r = y % x;
			} else {
				r = x % y;
			}

			if (r == 0) {
				gcd = y < x ? y : x;
				break;
			}

			x = y;
			y = r;
		}

		return gcd;
	}

}
