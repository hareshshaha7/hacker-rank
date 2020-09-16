package com.haresh.hackerrank.java;

/*
	Valid Username Regular Expression
	Problem Statement: https://www.hackerrank.com/challenges/valid-username-checker/problem
*/

import java.util.Scanner;

public class Program04 {
	static class UsernameValidator {
	    /*
	     * Write regular expression here.
	     */
//	    public static final String regularExpression = "^[a-zA-Z][a-z|A-z|0-9|\\_]{7,29}$";
//	    public static final String regularExpression = "^[[a-z][A-Z]][[a-z][A-Z][0-9]\\_]{7,29}$";
		public static final String regularExpression = "^[\\p{Alpha}][\\w]{7,29}$";
	}

	private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}