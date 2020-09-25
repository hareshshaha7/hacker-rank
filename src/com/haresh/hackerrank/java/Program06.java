package com.haresh.hackerrank.java;

/*
	Java Primality Test
	Problem Statement: https://www.hackerrank.com/challenges/java-primality-test/problem
*/

import java.math.*;
import java.util.*;

public class Program06 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(n);
        if (bigInteger.isProbablePrime(1)) 
        	System.out.println("prime");
        else
        	System.out.println("not prime");
        scanner.close();
    }
}
