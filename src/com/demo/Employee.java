package com.demo;

public class Employee {
	private void empId() {
		System.out.println("Employee ID : 123");
		}
	private void empName() {
        System.out.println("Employee Name : Sathish");
	}
	private void empAddress() {
        System.out.println("Employee Address : Choolaimedu");
	}
	
	public static void main(String[] args) {
		Employee d = new Employee();
		
		d.empId();
		d.empName();
		d.empAddress();
	}

}
