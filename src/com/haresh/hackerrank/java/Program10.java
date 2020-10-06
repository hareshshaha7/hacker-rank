package com.haresh.hackerrank.java;

/*
	Java Arraylist
	Problem Statement: https://www.hackerrank.com/challenges/java-arraylist/problem
*/

import java.util.*;

public class Program10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < lines; i++) {
			List<Integer> l = new ArrayList<Integer>();
			int count = sc.nextInt();
			
			for (int j = 0; j < count; j++) {
				l.add(sc.nextInt());
			}
			list.add(l);
		}

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	try {
        		int result = list.get(x-1).get(y-1);
            	System.out.println(result);
        	}
        	catch(IndexOutOfBoundsException ae) {
            	System.out.println("ERROR!");
        	}
        }
        sc.close();
    }
}