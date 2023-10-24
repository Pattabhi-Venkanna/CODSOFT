package com.codsoft.Student_Management_System;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
	
	private List<Student> students;
	private String filePath;
	
	public StudentManagement (String filPath) {
		this.filePath=filPath;
		students=new ArrayList<Student>();
		createFileIfNotExit();
		loadData();
	}

	private void loadData() {
		
		try(BufferedReader br= new BufferedReader(new FileReader(filePath))) {
			String line;
			while((line=br.readLine())!=null) {
				String[] parts=line.split(",");
				if(parts.length==3) {
					String name=parts[0].trim();
					int rollNumber=Integer.parseInt(parts[1].trim());
					String grade=parts[2].trim();
					students.add(new Student(name, rollNumber, grade));
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void createFileIfNotExit() {
		File file=new File(filePath);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	// adding student data
	public void addStudent(Student student) {
		students.add(student);
		saveData();
		System.out.println("Student data added sucefully");
	}
	
	//removing student using rollnumber because it is unique
	public void removeStudent(int rollNumber) {
		Student studentRemove=null;
		for(Student student:students) {
			if(student.getRollNumber()==rollNumber) {
				studentRemove=student;
				break;
			}
		}
		if(studentRemove!=null) {
			students.remove(studentRemove);
			saveData();
			System.out.println("Student data removed Succesfully");
		}
		else {
			System.out.println("Student is not is existed for roll number" +rollNumber);
		}
	}
	//searching the student using roll number
	public Student searchStudent(int rollNumber) {
		for(Student student:students) {
			if(student.getRollNumber()==rollNumber) {
				return student;
			}
		}
		return null;
	}
	
	// dispaly all students
	public void displayStudents() {
		for(Student student:students) {
			System.out.println(student);
		}
	}
	
	private void saveData() {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(filePath))) {
			for(Student student:students) {
				bw.write(student.getName()+","+student.getRollNumber()+","+student.getGrade());
				bw.newLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
