package com.haresh.hackerrank.java;

/*

	Java String Reverse
	Problem statement: https://www.hackerrank.com/challenges/java-string-reverse/problem

*/

import java.util.*;

public class Program01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		sc.close();
		/* Enter your code here. Print output to STDOUT. */
		String isPalindrome = "Yes";
		for (int i = 0; i < (A.length() + 1) / 2; i++) {
			if (A.charAt(i) != A.charAt(A.length() - i - 1))
				isPalindrome = "No";
		}

		System.out.println(isPalindrome);
	}
}
