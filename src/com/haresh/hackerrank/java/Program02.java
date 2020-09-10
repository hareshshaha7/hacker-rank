package com.haresh.hackerrank.java;

/*
	Java String Tokens
	Problem Statement: https://www.hackerrank.com/challenges/java-string-tokens/problem
*/

import java.util.*;

public class Program02 {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        String regex = "[ !,?._'@]+";
	        String[] tokens = s.split(regex);
	        System.out.println(tokens.length);

	        for (String token : tokens)
	            System.out.println(token);
	        scan.close();
	    }
	}

