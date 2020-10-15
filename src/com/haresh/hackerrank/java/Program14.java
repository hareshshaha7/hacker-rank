package com.haresh.hackerrank.java;
/*
	Java Priority Queue
	Problem Statement: https://www.hackerrank.com/challenges/java-priority-queue/problem
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return Double.compare(s1.getCgpa(), s2.getCgpa()) == 0
				? s1.getName().equals(s2.getName()) ? s1.getId() - s2.getId()
						: s1.getName().compareTo(s2.getName())
				: Double.compare(s2.getCgpa(), s1.getCgpa());
	}
	
}

class Priorities {

	public List<Student> getStudents(List<String> events) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> queue = new PriorityQueue<Student>(
				events.size(), new StudentComparator());

		for (int i = 0; i < events.size(); i++) {
			String[] event = events.get(i).split(" ");
			if (event[0].equals("ENTER")) {
				Student student = new Student(Integer.parseInt(event[3]), event[1], new Double(event[2]));
				queue.offer(student);
			}
			else
				queue.poll();
		}
		
		List<Student> result = new ArrayList<Student>(queue);
		Collections.sort(result, new StudentComparator());
		return result;
	}
}

class Student {
	private int id;
	private String name;
	private double cgpa;

	Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
}

public class Program14 {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}