package com.tns.firstpackage;

public class Base {
	
	public int varDefault=10;
	public int varPublic=20;
	public int varPrivate=30;
	public int varProtected=40;
	
	public void methoDefault()
	{
		System.out.println("Default access Base class");
		System.out.println("Default Variable: "+varDefault); }

	public void methodPublic() {

	System.out.println("Public access Base class");

	System.out.println("Public Variable: "+varPublic);
	}

	public void methodProtected() {

	System.out.println("Protected access Base class");
	}
	
	public void methodPrivate() {
		System.out.println("Private access Base class");

		System.out.println("Private Variable: "+varPrivate);
	}

}
