package com.haresh.hackerrank.algorithms;

/*
	
	Problem Statement: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
*/

import java.io.*;
import java.util.*;

public class Program16 {

	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {
		int dist1 = Math.abs(z - x);
		int dist2 = Math.abs(z - y);
		if (dist1 < dist2)
			return "Cat A";
		else if (dist1 > dist2)
			return "Cat B";
		else
			return "Mouse C";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = scanner.nextLine().split(" ");

			int x = Integer.parseInt(xyz[0]);

			int y = Integer.parseInt(xyz[1]);

			int z = Integer.parseInt(xyz[2]);

			String result = catAndMouse(x, y, z);

			System.out.println(result);
		}

		scanner.close();
	}
}
