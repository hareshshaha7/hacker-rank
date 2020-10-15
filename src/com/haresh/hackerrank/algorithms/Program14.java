package com.haresh.hackerrank.algorithms;

/*
	Counting Valleys
	Problem Statement: https://www.hackerrank.com/challenges/counting-valleys/problem
*/

import java.io.*;

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

class Result {

	public static int countingValleys(int steps, String path) {
		int numberOfValleys = 0;
		int depth = 0;
		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U') {
				depth--;
				if (depth == 0)
					numberOfValleys++;
			} else
				depth++;
		}

		return numberOfValleys;
	}

}

public class Program14 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int steps = Integer.parseInt(bufferedReader.readLine().trim());

		String path = bufferedReader.readLine();

		int result = Result.countingValleys(steps, path);

		System.out.println(String.valueOf(result));

		bufferedReader.close();
	}
}
