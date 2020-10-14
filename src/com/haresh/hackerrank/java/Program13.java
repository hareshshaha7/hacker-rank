package com.haresh.hackerrank.java;

import java.util.BitSet;
import java.util.Scanner;

/*
	Java BitSet
	Problem Statement: https://www.hackerrank.com/challenges/java-bitset/problem
*/

public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int bitSetSize = sc.nextInt();
	    int tests = sc.nextInt();
	    sc.nextLine();
	    
	    BitSet b1 = new BitSet(bitSetSize);
	    BitSet b2 = new BitSet(bitSetSize);
	    
	    for (int i=0; i<tests; i++) {
	    	String[] testcase = sc.nextLine().split(" ");
	    	switch(testcase[0]) {
	    		case "AND":
	    			if (testcase[1].equals("1"))
	    				b1.and(b2);
	    			else
	    				b2.and(b1);
	    			break;
	    		case "OR":
	    			if (testcase[1].equals("1"))
	    				b1.or(b2);
	    			else
	    				b2.or(b1);
	    			break;
	    		case "XOR":
	    			if (testcase[1].equals("1"))
	    				b1.xor(b2);
	    			else
	    				b2.xor(b1);
	    			break;
	    		case "FLIP":
	    			if (testcase[1].equals("1"))
	    				b1.flip(Integer.parseInt(testcase[2]));
	    			else
	    				b2.flip(Integer.parseInt(testcase[2]));
	    			break;
	    		case "SET":
	    			if (testcase[1].equals("1"))
	    				b1.set(Integer.parseInt(testcase[2]));
	    			else
	    				b2.set(Integer.parseInt(testcase[2]));
	    			break;
	    	}

			System.out.println(b1.cardinality() +" "+ b2.cardinality());
	    }		
	}

}
