package com.haresh.hackerrank.algorithms;

/*
	Grading Students
	Problem Statement: https://www.hackerrank.com/challenges/grading/problem
*/

import java.io.*;
import java.util.*;


public class Program01 {

	static class Result {
	
		/*
		 * Complete the 'gradingStudents' function below.
		 *
		 * The function is expected to return an INTEGER_ARRAY. The function accepts INTEGER_ARRAY grades as parameter.
		 */
	
		public static List<Integer> gradingStudents(List<Integer> grades) {
			// Write your code here
			// Write your code here
	        List<Integer> list = new ArrayList<Integer>();
	        for (int grade : grades) {
	            if (grade < 38) {
	                list.add(grade);
	            }
	            else if (grade > 40) {
	                if (grade % 5 >= 3) {
	                    list.add(grade + 5 - (grade % 5));
	                }
	                else {
	                    list.add(grade);
	                }                    
	            }
	            else {
	                list.add(40);
	            }            
	        }
	        return list;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = new ArrayList<>();

		for (int i = 0; i < gradesCount; i++) {
			int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
			grades.add(gradesItem);
		}

		List<Integer> result = Result.gradingStudents(grades);

		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(String.valueOf(result.get(i)));

			if (i != result.size() - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
