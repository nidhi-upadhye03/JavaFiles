package com.tns.interfacedemo;

public class Student implements Registerable{
	private int id;
    private String name;
    private double fees;
    private String course;
	
	
	public Student(int id, String name, double fees, String course) {
        super();
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", course=" + course + "]";
    }
}

