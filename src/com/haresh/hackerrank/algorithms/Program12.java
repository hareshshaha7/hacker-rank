package com.haresh.hackerrank.algorithms;

/*
	Sales by Match
	Problem Statement: https://www.hackerrank.com/challenges/sock-merchant/problem
*/

import java.io.*;
import java.util.*;

public class Program12 {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
//    	List<Integer> list = new LinkedList<Integer>();
		/*
		 * We have used set instead of list is because The call to contains() on colors
		 * will be O(1) for a HashSet versus O(n) for a List, and you won't store
		 * duplicates.
		 */
		
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (set.contains(ar[i])) {
				count++;
				set.remove((Integer) ar[i]);
			} else
				set.add(ar[i]);
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		System.out.println(String.valueOf(result));
		scanner.close();
	}
}
