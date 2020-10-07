package com.haresh.hackerrank.java;

/*
	Java 1D Array (Part 2)
	Problem Statement: https://www.hackerrank.com/challenges/java-1d-array/problem
*/

import java.util.*;

public class Pragram11 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean canWalk = true;
        int index = 0;
        while(canWalk) {
            if((index + leap) >= game.length)
                return true;
            if (game[index + leap] == 0)
                index = index + leap;
            else if(game[index + 1] == 0) 
                index++;
            else if (game[index + 1] != 0 && game[index + leap] != 0)
                canWalk = false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}