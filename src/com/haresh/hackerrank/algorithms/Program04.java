package com.haresh.hackerrank.algorithms;

/*
	Between Two Sets
	Problem Statement: https://www.hackerrank.com/challenges/between-two-sets/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Program04 {
	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. 
	 * The function accepts following
	 * parameters: 
	 * 	1. INTEGER_ARRAY a 
	 * 	2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int lastIndexA = a.size() - 1, countI = 0;
		for (int i = a.get(lastIndexA); i <= b.get(0); i++) {
			int countA = 0, countB = 0;
			for (int j = 0; j < a.size(); j++) {
				if (i % a.get(j) == 0)
					countA++;
			}
			if (countA == a.size()) {
				for (int m = 0; m < b.size(); m++) {
					if (b.get(m) % i == 0)
						countB++;
				}
			}
			if (countB == b.size())
				countI++;
		}
		return countI;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrTemp[i]);
			arr.add(arrItem);
		}

		String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Integer> brr = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int brrItem = Integer.parseInt(brrTemp[i]);
			brr.add(brrItem);
		}

		int total = getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}