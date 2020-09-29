package com.haresh.hackerrank.algorithms;

/*
	Day of the Programmer
	Problem Statement: https://www.hackerrank.com/challenges/day-of-the-programmer/problem
*/

import java.io.*;

public class Program10 {

	// Complete the dayOfProgrammer function below.
	static String dayOfProgrammer(int year) {
		if (year == 1918) 
			return "26.09.1918";
		else if (year < 1918) {
			if (year % 4 == 0)
				return "12.09." + year;
			else
				return "13.09." + year;
		} 
		else {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				return "12.09." + year;
			else
				return "13.09." + year;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(bufferedReader.readLine().trim());

		String result = dayOfProgrammer(year);

		System.out.println(result);

		bufferedReader.close();
	}
}
