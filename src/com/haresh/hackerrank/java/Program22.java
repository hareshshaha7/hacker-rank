package com.haresh.hackerrank.java;

/*
	Prime Checker
	Problem Statement: https://www.hackerrank.com/challenges/prime-checker/problem
*/

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;

public class Program22 {
	class Prime {

		public void checkPrime(int... n1) {
			for (int i = 0; i < n1.length; i++) {
				if (isPrime(n1[i])) {
					System.out.print(n1[i] + " ");
				}
			}
			System.out.println();
		}

		public boolean isPrime(int number) {
			if (number < 2) {
				return false;
			}
			if (number == 2) {
				return true;
			}
			if (number > 2) {
				for (int j = 2; j < (int) Math.sqrt(number); j++) {
					if (number % j == 0) {
						return false;
					}
				}
			}
			return true;
		}

	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Program22().new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}