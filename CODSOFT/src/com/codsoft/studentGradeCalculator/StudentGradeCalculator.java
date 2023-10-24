package com.codsoft.studentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {

		System.out.println("Welcome to Student Grade Calculator");
		Scanner sc=new Scanner(System.in);
		String decision;
		int total;
		double average_percentage;
		String grade;
		
		do {
			total=0;
			System.out.println("enter number of subjects you want to enter:");
			int no_sub=sc.nextInt();
			for(int i=1;i<=no_sub;i++) {
				System.out.println("subject-"+i);
				total=total+sc.nextInt();
			}
			average_percentage=(double)total/(no_sub*100)*100;
			
			if(average_percentage>=90) grade="A+";
			else if(average_percentage>=80) grade="A";
			else if(average_percentage>=70) grade="B";
			else if(average_percentage>=60) grade="C";
			else if(average_percentage>=50) grade="D";
			else grade="Fail";
			System.out.println("Total marks are "+total);
			System.out.println("The average percentage is "+(int)average_percentage);
			System.out.println("Your grade is "+grade);
			
			System.out.println("Do you want to know other student grades yes/no ");
			decision=sc.next().toUpperCase();
		} while (decision.equals("YES"));
		
		System.out.println("Thank you for using Student Grade Calculator");

	}

}
