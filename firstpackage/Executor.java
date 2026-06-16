package com.tns.firstpackage;

public class Executor {
	
	public static void main(String[] args) 
	
	{
		Base obj = new Base();
		obj.varDefault=20;
		obj.varProtected=90;
		obj.varPublic=70;
		obj.varPrivate=80;

		obj.methoDefault();
		obj.methodPublic();
		obj.methodProtected();
		obj.methodPrivate();
	}

}
