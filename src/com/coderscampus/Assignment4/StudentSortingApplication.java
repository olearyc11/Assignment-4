package com.coderscampus.Assignment4;

import java.io.IOException;

public class StudentSortingApplication {

	public static void main(String[] args) throws IOException {
		
		FileService fileService = new FileService();
		StudentService studentService = new StudentService(fileService);
		StudentReportService reportService = new StudentReportService(fileService, studentService);
		
		reportService.generateCourseStudentsReport("COMPSCI", "course1.csv");
		reportService.generateCourseStudentsReport("APMTH", "course2.csv");
		reportService.generateCourseStudentsReport("STAT", "course3.csv");
		
	}

}
