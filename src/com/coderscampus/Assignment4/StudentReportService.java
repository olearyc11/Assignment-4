package com.coderscampus.Assignment4;

public class StudentReportService {

	private FileService fileService;
	private StudentService studentService;
	
	public StudentReportService(FileService fileService, StudentService studentService) {
		this.fileService = fileService;
		this.studentService = studentService;
	}
	
	public void generateCourseStudentsReport(String courseKey, String fileName) {
		Student[] courseStudents = studentService.filterStudentsByCourse(courseKey);
		fileService.writeStudentsFromFile(courseStudents, fileName);
	}
}
