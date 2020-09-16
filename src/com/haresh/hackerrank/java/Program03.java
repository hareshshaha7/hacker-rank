package com.haresh.hackerrank.java;

/*
	Java Regex
	Problem Statement: https://www.hackerrank.com/challenges/java-regex/problem
*/

import java.util.Scanner;

class Program03{

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

	//Write your code here
	static class MyRegex {
		// public static String pattern = "((00[0-9]|0[0-9]|[0-9]|0[1-9][0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.)){3}+(00[0-9]|0[0-9]|[0-9]|0[1-9][0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$";
		public static String pattern = "(([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.)){3}+([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|2[0-4][0-9]|25[0-5])$";
	}
}