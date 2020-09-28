package com.haresh.hackerrank.algorithms;

/*
	Migratory Birds
	Problem Statement: https://www.hackerrank.com/challenges/migratory-birds/problem
 */

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Program09 {

	// Complete the migratoryBirds function below.
	static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> birdSightings = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.size(); i++) {
			birdSightings.put(arr.get(i), birdSightings.getOrDefault(arr.get(i), 0) + 1);
		}

		List<Integer> list = new ArrayList<Integer>(birdSightings.keySet());
		Collections.sort(list, (l1, l2) -> birdSightings.get(l1) == birdSightings.get(l2) ? l1 - l2
				: birdSightings.get(l2) - birdSightings.get(l1));
		return list.get(0);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = migratoryBirds(arr);

		System.out.println(String.valueOf(result));

		bufferedReader.close();
	}
}
