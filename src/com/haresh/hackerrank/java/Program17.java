package com.haresh.hackerrank.java;

/*
	Java Exception Handling (Try-catch)
	Problem Statement: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */

import java.util.*;

public class Program17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println(result);
		} catch (Exception exc) {
			if (exc instanceof InputMismatchException)
				System.out.println(exc.getClass().getName());
			else
				System.out.println(exc);
		}
		sc.close();
    }
}