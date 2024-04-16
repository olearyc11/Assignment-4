package com.coderscampus.Assignment4;

public class Student {
	private int studentId;
	private String studentName;
	private String course;
	private int grade;
	
	
	public Student(int studentId, String studentName, String course, int grade) { 
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.grade = grade;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	

	
}
