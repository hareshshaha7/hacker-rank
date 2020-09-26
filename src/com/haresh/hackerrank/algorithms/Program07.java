package com.haresh.hackerrank.algorithms;

/*
	Sub-array Division
	https://www.hackerrank.com/challenges/the-birthday-bar/problem
*/

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Program07 {

	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {
		int result = 0;
		int n = s.size();
		int[] arr = new int[n + m];

		for (int i = 0; i < n; i++) {
			for (int j = i; j < i + m && j < n; j++)
				arr[i] = arr[i] + s.get(j);
			if (arr[i] == d)
				result++;
		}

		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int d = Integer.parseInt(dm[0]);

		int m = Integer.parseInt(dm[1]);

		int result = birthday(s, d, m);

		System.out.println(String.valueOf(result));

		bufferedReader.close();
	}
}
