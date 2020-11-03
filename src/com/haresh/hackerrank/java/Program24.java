package com.haresh.hackerrank.java;

/*
	Java Singleton Pattern
	Problem Statement: https://www.hackerrank.com/challenges/java-singleton/problem
*/

class Singleton {
	/*
		// Singleton in multi-threaded environment
		private volatile static Singleton instance;
	    public static String str;
	    private Singleton() {}
	    
	    static Singleton getSingleInstance() {
	        if (instance == null) {
	            synchronized (Singleton.class) {
	                if (instance == null) {
	                    instance = new Singleton();
	                }
	            }
	        }
	        return instance;
	    }
	*/

	private static Singleton instance;
	public String str;

	private Singleton() {
	}

	public static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class Program24 {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleInstance();
		singleton.str = "fghjkl;";
		System.err.println(singleton.str);

		Singleton singleton1 = Singleton.getSingleInstance();
		System.err.println(singleton1.str);
	}
}