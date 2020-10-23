package com.haresh.hackerrank.java;

/*
	Java Exception Handling
	Problem Statement: https://www.hackerrank.com/challenges/java-exception-handling/problem
	
*/

import java.util.Scanner;

public class Program18 {
	class MyCalculator {
		public long power(int n, int p) throws Exception {
			if (n < 0 || p < 0)
				throw new Exception("n or p should not be negative.");
			else if (n == 0 && p == 0)
				throw new Exception("n and p should not be zero.");
			else {
				int power;
				if (n == 0)
					power = 0;
				else
					power = 1;
				for (int i = 0; i < p; i++) {
					power *= n;
				}
				return power;
			}
		}
	}

	public static final MyCalculator my_calculator = new Program18().new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}