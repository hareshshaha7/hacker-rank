package com.haresh.hackerrank.java;

/*
	Java Dequeue
	Problem Statement: https://www.hackerrank.com/challenges/java-dequeue/problem
*/

import java.util.*;

public class Program12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		int n = in.nextInt();
		int m = in.nextInt();
		
		int maxUniqueInt = 0;
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			
			deque.offerLast(num);
			set.add(num);
				
			if (deque.size() == m) {
				if (maxUniqueInt < set.size())
					maxUniqueInt = set.size();
				
				int removedNumber = deque.pollFirst();
				if (!deque.contains(removedNumber))
					set.remove(removedNumber);
			}
			
		}
		System.out.println(maxUniqueInt);

		in.close();
	}
}
