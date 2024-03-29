package com.coderscampus.Assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class StudentService {

	static Student[] students = new Student[101];
	

	
	public static Student[] readStudentFile() throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("student-master-list.csv"));) {
			reader.readLine();
			String line;
			int i = 0;
				while ((line = reader.readLine()) != null) {
						String[] studentLine = line.split(",");
						students[i] = new Student(studentLine[0], studentLine[1], studentLine[2], studentLine[3]);
						i++;
			}
		}
		return students;
	}
	
	
	
	public static void studentIntoFile() throws IOException {
		BufferedWriter compSciFile = null;
		BufferedWriter apMathFile = null;
		BufferedWriter statFile = null;
		
		try {
			 compSciFile = new BufferedWriter(new FileWriter("course1.csv"));
			 apMathFile = new BufferedWriter(new FileWriter("course2.csv"));
			 statFile = new BufferedWriter(new FileWriter("course3.csv"));
			 BufferedReader reader = new BufferedReader(new FileReader("student-master-list.csv"));
			 String header = reader.readLine();
			 compSciFile.write(header + "\n");
			 apMathFile.write(header + "\n");
			 statFile.write(header + "\n");
			 reader.close();
			 
			 
			 
			 for (Student student : students) {
				 while (student != null) {
				 if (student.getCourse().contains("COMPSCI")) {
					 compSciFile.write(studentToString(student) + "\n");
					 break;
				 } else if (student.getCourse().contains("APMTH")) {
					 apMathFile.write(studentToString(student) + "\n");
					 break;
				 } else if (student.getCourse().contains("STAT")) {
					 statFile.write(studentToString(student) + "\n");
					 break;
				 } 
			   }
			 }	 
		} finally {
			if (compSciFile != null && apMathFile != null && statFile != null) 
				compSciFile.close();
				apMathFile.close();
				statFile.close();
		}
	}
	

	
	public static String studentToString(Student student) {
		return student.getStudentId() + "," + student.getStudentName() + "," + student.getCourse() + "," + student.getGrade();
		}
	}
	
	


