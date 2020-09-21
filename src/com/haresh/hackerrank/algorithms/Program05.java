package com.haresh.hackerrank.algorithms;

/*
	Tag Content Extractor
	Problem Statement: https://www.hackerrank.com/challenges/tag-content-extractor/problem
*/

import java.util.*;
import java.util.regex.*;

public class Program05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			// Write your code here
			boolean matchFound = false;
			Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher m = r.matcher(line);

			while (m.find()) {
				System.out.println(m.group(2));
				matchFound = true;
			}
			if (!matchFound) {
				System.out.println("None");
			}

			testCases--;
		}
	}
}
