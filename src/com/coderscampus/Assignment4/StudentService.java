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
	
	public void placeStudents() throws IOException {
		for (Student student: students) {
			if (student.getCourse().equals("COMPSCI 321")) {
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("course1.csv"));) {
					
				
				}
			}
		}
		
	}
}
