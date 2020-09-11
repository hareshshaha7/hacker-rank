package com.haresh.hackerrank.java;

/*
	Java String Tokens
	Problem Statement: https://www.hackerrank.com/challenges/java-string-tokens/problem
*/

import java.util.*;

public class Program02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim();
		// Write your code here.
		if (!s.isEmpty()) {
			String regex = "[ !,?\\\\.\\\\_'@]+";
			String[] tokens = s.split(regex);
			System.out.println(tokens.length);

			for (String token : tokens)
				if (token != null)
					System.out.println(token);
		} else
			System.out.println(0);

		scan.close();
	}
}
