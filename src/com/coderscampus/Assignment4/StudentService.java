package com.coderscampus.Assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentService {

	Student[] students = new Student[101];
	BufferedReader reader = null;
	
	
	
	public void readStudentFile() throws IOException {
		try {
			reader = new BufferedReader(new FileReader("student-master-list.csv"));
		
		} finally {
			if (reader != null)
				reader.close();
		}
					
		
	}
	
	
}
