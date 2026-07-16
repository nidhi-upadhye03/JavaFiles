package com.tns.finaldemo;

public class FinalVariable {
	//final int x;
	final int x=100;
	//Declare a static blank final variable.
	final static int Y;
	//Declare and initialize a static blank final variable.
	final static int Z = 10;
	
	static {
		Y = 20;
	}
	//instance method 
	void change() {
		//x=30; //final variables can't be reassigned
		//Y=200; //final static variables can't be reassigned
	}
	
	static {
		//Y=20;
		//Z=200;
	}
}
