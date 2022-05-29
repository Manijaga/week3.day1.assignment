package org.student;

import org.department.Department;


public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name is - Manigandan Kanniyappan");
	}
	public void studentDepart() {
		System.out.println("Student Department - Bio-Maths");
	}
	
	public void studentId() {
		System.out.println("Student ID - 12345");
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student myStudent = new Student();
		myStudent.collegeName();
		myStudent.collegeCode();
		myStudent.collegeRank();
		myStudent.departmentName();
		myStudent.studentName();
		myStudent.studentId();
		myStudent.studentDepart();
		
		
	}

}
