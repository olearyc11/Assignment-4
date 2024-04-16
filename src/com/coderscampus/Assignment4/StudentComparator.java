package com.coderscampus.Assignment4;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		  if (o1 == null && o2 == null) {
	            return 0; 
	        } else if (o1 == null) {
	            return 1; 
	        } else if (o2 == null) {
	            return -1; 
	        }
		
		return Integer.compare(o2.getGrade(), o1.getGrade());
	}
}
