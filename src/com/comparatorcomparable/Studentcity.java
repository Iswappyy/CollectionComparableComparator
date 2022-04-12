package com.comparatorcomparable;

import java.util.Comparator;

public class Studentcity implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.city.compareTo(o2.city);
	}
	

}
