package com.haresh.hackerrank.java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/*
	Java Reflection - Attributes
	Problem Statement: https://www.hackerrank.com/challenges/java-reflection-attributes/problem
*/

public class Program20 {

    public static void main(String[] args){
        Class<Student> student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method: methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}