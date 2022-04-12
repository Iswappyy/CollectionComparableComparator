package com.comparatorcomparable;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(123,"Swapnil","Amravati");
		Student s2 = new Student(456,"Bhumesh","Nagpur");
		Student s3 = new Student(789,"Akshay","Akola");
		Student s4 = new Student(546,"Ajay","Pune");
		
		TreeSet t1 = new TreeSet();
	t1.add(s1);
	t1.add(s2);
	t1.add(s3);
	t1.add(s4);
	
	System.out.println("Sorting with Id: "+t1);
	
	System.out.println();
	System.out.println();
	
	StudentNameComparator nameSort = new StudentNameComparator();
	
	TreeSet t2 = new TreeSet(nameSort);
	
	t2.add(s1);
	t2.add(s2);
	t2.add(s3);
	t2.add(s4);
	
	System.out.println("Sorting with Name: "+ t2);
	
	System.out.println();
	System.out.println();
	
	Studentcity citySort = new Studentcity ();
	
	TreeSet t3 = new TreeSet(citySort);
	
	t3.add(s1);
	t3.add(s2);
	t3.add(s3);
	t3.add(s4);
	
	System.out.println("Sorting with city: "+ t3);
		
	}

}
