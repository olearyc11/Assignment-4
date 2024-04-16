package com.coderscampus.Assignment4;

import java.util.Arrays;

public class StudentService {

	private Student[] students;
	
	public StudentService(FileService fileService) {
		students = fileService.getStudentsFromFile();
		sortStudents();
	}
	
	public void sortStudents() {
		Arrays.sort(students, new StudentComparator());
	}
	
	public Student[] filterStudentsByCourse(String courseKey) {
		Student[] courseStudents = new Student[students.length];
		int counter  = 0;
		for (Student student : students) {
			if (student.getCourse().contains(courseKey)) {
				courseStudents[counter++] = student;
			}
		}
		return courseStudents;
	}	
}
	
	


