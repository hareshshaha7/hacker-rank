package com.haresh.hackerrank.java;

/*
	Java Dequeue
	Problem Statement: https://www.hackerrank.com/challenges/java-dequeue/problem
*/

import java.util.*;
public class Program12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxUniqueInt = 0;
        
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (deque.size() == m)
            	deque.pollFirst();

            if (!deque.contains(num)) 
            	deque.offerLast(num);
            
            if (maxUniqueInt < deque.size())
            	maxUniqueInt = deque.size();
        }
        System.out.println(maxUniqueInt);
        
        in.close();
    }
}
