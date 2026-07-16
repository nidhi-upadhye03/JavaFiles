package com.tns.interfacedemo;

public class InterfaceDemo {
	public static void main(String[] args) {
		Student s = new Student(101,"Neha",12000,"C++");
		System.out.println(s);
		if(s instanceof Registerable)
			System.out.println("Student is Registerable");
		else
			System.out.println("Student is not registered for the course");
		
	}

}
