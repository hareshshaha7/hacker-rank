package com.haresh.hackerrank.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
	Organization Structure involving employees and their manager
	1) public void addEmployee(int empId, String name, int mgrId);
	2) public Employee getManager(int empId);
	3) public List<Employee> getAllReportees(int empId);
	A is manager of B,C,D
	B is manager E,F,G
	C is manager of X,Y,Z 
	and if I call getAllReportees with id of A, it should return B,C,D,E,F,G,X,Y,Z
*/

class Employee {
	int empId;
	String name;
	int mgrId;
	
	public Employee(int empId, String name, int mgrId) {
		super();
		this.empId = empId;
		this.name = name;
		this.mgrId = mgrId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", mgrId=" + mgrId + "]";
	}
	
}

public class Sample {
	Map<Employee, List<Employee>> employeeMap= new HashMap<Employee, List<Employee>>();
	/*
	 * 
	 1 -> 2
	 2 -> 3
	 */
//	TreeMap<Integer, Employee> employees = new TreeMap<Integer, Employee>();
	
	public void addEmployee(int empId, String name, int mgrId) {
		Employee emp = new Employee(empId, name, mgrId);
//		employeeMap.con
		
//		employees.put(empId, emp);
	}
	
	public Employee getManager(int empId) {
//		Employee emp = employees.get(empId);
//		
//		return employees.get(emp.mgrId);
	}
	
	public List<Employee> getAllReportees(int empId) {
		
		TreeMap<Integer, Employee> reportees = employees.containsKey(empId);
		
	}
	
	public static void main() {
		
	}
}
