package com.haresh.hackerrank.algorithms;

/*
	Divisible Sum Pairs
	Problem Statement: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */

import java.io.*;
import java.util.*;

public class Program08 {

	// Complete the divisibleSumPairs function below.
	static int divisibleSumPairs(int n, int k, int[] ar) {
		int result = 0;
		/*
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar[i] + ar[j]) % k == 0)  {
					System.out.println((ar[i] + ar[j]));
					result++;
				}
			}
		}
		*/
		
		int[] arr = new int[k];
		for (int i = 0; i < n; i++) {
			int remender = ar[i] % k;
			int complement = remender == 0 ? 0 : k - remender;
			result += arr[complement];
			arr[remender]++;
		}
		return result;

		/*
			input		1 3 2 6 1 2
		 	remender	1 0 2 0 1 2
			complement	2 0 1 0 2 1 
				
			arr[0]		0 1 1 2 2 2
			arr[1]		1 1 1 1 2 2
			arr[2]		0 0 1 1 1 2
			result		0 0 1 2 3 5
		*/
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = divisibleSumPairs(n, k, ar);

		System.out.println(String.valueOf(result));

		scanner.close();
	}
}
