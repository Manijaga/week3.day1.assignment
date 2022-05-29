package org.student;

public class Students {
	//Method Overloading
	public void studentInfo(int id) {
		System.out.println("Student ID - " + id);
	}

	public void studentInfo(int id, String name ) {
		System.out.println("Student Id is - " + id + " Student Name is - " + name);
	}

	public void studentInfo(String email, int phoneNumber ) {
		System.out.println("Student E-mail Id Is - " + email + " And phone Numbe is - " + phoneNumber);
	}
	
	public static void main(String[] args) {
		
		Students myStudent = new Students();
		myStudent.studentInfo(3465);
		myStudent.studentInfo(3245, "Manigandan");
		myStudent.studentInfo("manijaga1991@gmail.com", 3465);
		
	}
}
