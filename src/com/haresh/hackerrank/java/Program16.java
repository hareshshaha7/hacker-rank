package com.haresh.hackerrank.java;

/*
	Java Instanceof keyword
	Problem Statement: https://www.hackerrank.com/challenges/java-instanceof-keyword/problem
*/

import java.util.*;

public class Program16 {

	class Student {
	}

	class Rockstar {
	}

	class Hacker {
	}

	static String count(ArrayList<Object> mylist) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < mylist.size(); i++) {
			Object element = mylist.get(i);
			if (element instanceof Student)
				a++;
			if (element instanceof Rockstar)
				b++;
			if (element instanceof Hacker)
				c++;
		}
		String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
		return ret;
	}

	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<Object>();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			if (s.equals("Student"))
				mylist.add(new Program16().new Student());
			if (s.equals("Rockstar"))
				mylist.add(new Program16().new Rockstar());
			if (s.equals("Hacker"))
				mylist.add(new Program16().new Hacker());
		}
		
		sc.close();
		System.out.println(count(mylist));
	}
}