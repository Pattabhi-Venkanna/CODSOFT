package com.codsoft.Student_Management_System;

import java.util.Scanner;

public class StudentManagementApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentManagement studentManagement=new StudentManagement("studentData.csv");
		
		while(true) {
			System.out.println("Studenet Management Application");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Search Student");
			System.out.println("4. Display All Students");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			
			int option = sc.nextInt();
			sc.nextLine();
			System.out.println(option);
			
			switch (option) {
			case 1:
				System.out.println("Enter Student Name: ");
				String name=sc.nextLine();
				System.out.println("Enter Roll Number: ");
				int rollNo=sc.nextInt();
				System.out.println("Enter Grade: ");
				String grade=sc.next();
				studentManagement.addStudent(new Student(name, rollNo, grade));
				
				break;
			case 2:
				System.out.println("Enter Roll Number to remove student: ");
				int rollNumberRemove=sc.nextInt();
				studentManagement.removeStudent(rollNumberRemove);
				break;
			case 3:
				System.out.println("Enter Roll Number to search for Student: ");
				int rollNumberSearch=sc.nextInt();
				Student foundStudent=studentManagement.searchStudent(rollNumberSearch);
				if (foundStudent!=null) {
					System.out.println("Student found: "+foundStudent);
				} else {
					System.out.println("Student is not found");
				}
				break;
			case 4:
				studentManagement.displayStudents();
				break;
			case 5:
				System.out.println("Thank you for using the Student Management System Application");
				System.exit(0);
				break;
			default: 
				System.out.println("Invalid Option. enter valid option");
			}
		}

	}

}
