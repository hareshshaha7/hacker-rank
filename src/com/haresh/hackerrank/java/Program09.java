package com.haresh.hackerrank.java;

/*
	Java Subarray
	Problem Statement: https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");
        int[] array = new int[n];
        sc.close();
        
        // Print Array by converting it into List
        System.out.println(Stream.of(arr).map(Integer::parseInt).collect(Collectors.toList()));
        
        for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(arr[i]);
		} 
        
        int count = 0;
        for (int i = 0; i < n; i++) {
        	if (array[i] < 0)
        		count++;
        	int sum = array[i];
			for (int j = i+1; j < n; j++) {
				sum += array[j];
				if (sum < 0)
					count++;
			}
		}
        System.out.println(count);
    }

}