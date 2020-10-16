package com.haresh.hackerrank.algorithms;

/*
	Electronics Shop
	Problem Statement: https://www.hackerrank.com/challenges/electronics-shop/problem
*/

import java.io.*;
import java.util.*;

public class Program15 {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSpent = -1;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int count = 0;
        for (int j = drives.length -1, i = 0; j >= 0 ; j--) {
        	
        	for (; i < keyboards.length; i++) {
        		count++;
				int spent = keyboards[i] + drives[j];
				if (maxSpent < spent && spent <= b) {
					maxSpent = (keyboards[i] + drives[j]);
				}
				if (spent >= b)
					break;
			}
		}
        System.out.println(count);
        return maxSpent;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] bnm = scanner.nextLine().split(" ");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println(String.valueOf(moneySpent));
        scanner.close();
    }
}
