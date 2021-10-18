package com.objectAsArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListObject {
	Scanner sc = new Scanner(System.in);
	Student student = new Student();
	ArrayList<Student> studentList = new ArrayList<>();

	public void add() {
		System.out.println("Enter Name of customer :-");
		student.setName(sc.nextLine());
		
		System.out.println("Enter Mobile number :-");
		student.setMobileNumber(sc.nextLine());
		studentList.add(new Student(student.getName(), student.getMobileNumber()));
		
		System.out.println("successfully added  details");
		System.out.println("Name is :- " + student.getName() + " Mobile number is :- " + student.getMobileNumber());
	}

	public void update() {
		Boolean found = false;
		int i = 0;
		System.out.println("Enter Name of customer :-");
		student.setName(sc.nextLine());
		for (i=0; i < studentList.size(); i++) {
			if (studentList.get(i).getName().toLowerCase().equalsIgnoreCase(student.getName())) {
				System.out.println("Enter Name of mobile number:-");
				student.setMobileNumber(sc.nextLine());
				studentList.set(i, student);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No such student with name " + student.getName());
		}else {
			System.out.println("Mobile numbe of Student " + student.getName()  + " changes to  " + student.getMobileNumber()) ;
		}
		
	}

	public void find() {
		System.out.println("Enter Name of customer :-");
		student.setName(sc.nextLine());
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getName().toLowerCase().equalsIgnoreCase(student.getName())) {
				System.out.println("Mobile number of Student " + student.getName() + "is  " + student.getMobileNumber());
				break;
			} else {
				System.out.println("No Student with name  " + student.getName() + "  exist ");
			}

		}

	}

	public void delete() {
		System.out.println("Enter Name of customer :-");
		student.setName(sc.nextLine());
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getName().toLowerCase().equalsIgnoreCase(student.getName())) {
				studentList.remove(i);
				System.out.println("Student " + student.getName() + " deleted ");
				break;
			} else {
				System.out.println("No Student with name " + student.getName() + "exist ");
			}

		}
	}

	public void displayAll() {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getName() + "            " +studentList.get(i).getMobileNumber() );
		}
	}
}