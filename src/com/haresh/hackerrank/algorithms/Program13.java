package com.haresh.hackerrank.algorithms;

/*
	Drawing Book
	Problem Statement: https://www.hackerrank.com/challenges/drawing-book/problem
*/

import java.io.*;
import java.util.*;

public class Program13 {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int count = 0;
        if (n%2 != 0)
            n--;

        for (int i=1, j=n; i<p && j>p; i=i+2, j=j-2) {
            count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
