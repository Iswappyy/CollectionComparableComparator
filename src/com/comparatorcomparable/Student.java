package com.comparatorcomparable;

public class Student implements Comparable<Student>  {
	int roll_num;
	String name;
	String city;
	
	public Student(int roll_num, String name, String city) {
		super();
		this.roll_num = roll_num;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [roll_num=" + roll_num + ", name=" + name + ", city=" + city + "]";
	}
	
	public int compareTo(Student s) {
		if(s.roll_num == this.roll_num) {
			return 0;
		}
		else if(s.roll_num > this.roll_num) {
			return -1;
		}
		else
			return 1;
	}
	

}
