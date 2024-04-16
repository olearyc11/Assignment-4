package com.coderscampus.Assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

	private String FILENAME = "student-master-list.csv";

	public Student[] getStudentsFromFile() {
		BufferedReader fileReader = null;
		Student[] students = new Student[100];
		int counter = 0;

		try {
			String line = null;
			fileReader = new BufferedReader(new FileReader(FILENAME));
			fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				String[] lineData = line.split(",");
				int studentID = Integer.parseInt(lineData[0]);
				String name = lineData[1];
				String coureName = lineData[2];
				int grade = Integer.parseInt(lineData[3]);
				Student student = new Student(studentID, name, coureName, grade);
				students[counter] = student;
				counter++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;
	}

	public void writeStudentsFromFile(Student[] students, String filename) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename));) {
			writer.write("Student ID, Student Name, Course, Grade \n");
			for (Student student : students) {
				if (student != null) {
					writer.write(student.getStudentId() + "," + student.getStudentName() + "," + student.getCourse()
							+ "," + student.getGrade());
					writer.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
