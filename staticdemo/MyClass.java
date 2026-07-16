package com.tns.staticdemo;

public class MyClass {
	private int section;
	private static int srNo;
	
	//static block
	static {
		System.out.println("within staic block");
		srNo=1000;
		//section=10;
		
	}
	//Default Constructor
	MyClass(){
		System.out.println("within Default Constructor");
		srNo++;
		section++;
	}
	@Override
	public String toString() {
		return "MyClass [Serial No "+srNo+" , Section=" + section+"]";
		
	}
	//static method
	 static void display()
     {
     //    System.out.println("Section : "+section); //can't access non static members    
         System.out.println("Serial No. "+srNo); //static variable
         
     }

}
