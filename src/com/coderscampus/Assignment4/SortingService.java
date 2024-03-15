package com.coderscampus.Assignment4;

import java.util.Comparator;

public class SortingService implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		  if (o1 == null && o2 == null) {
	            return 0; 
	        } else if (o1 == null) {
	            return 1; 
	        } else if (o2 == null) {
	            return -1; 
	        }
		
		Integer grade1 = Integer.parseInt(o1.getGrade());
		Integer grade2 = Integer.parseInt(o2.getGrade());
		return Integer.compare(grade2, grade1);
	}

	
	
	
	

}
