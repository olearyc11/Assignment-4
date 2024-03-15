package com.coderscampus.Assignment4;

import java.io.IOException;
import java.util.Arrays;



public class StudentSortingApplication {

	public static void main(String[] args) throws IOException {
		
		StudentService.readStudentFile();
		Arrays.sort(StudentService.students, new SortingService());
		StudentService.studentIntoFile();
		
	
		
		
		
//		for (Student student : StudentService.students) {
//			System.out.println(student.getStudentName());
//		}
	}

}
