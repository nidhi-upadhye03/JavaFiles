package com.tns.abstraction.demo;

public abstract class Shape
{
	protected float area;
	
	abstract void calArea();//declare
	
	void show() //concrete method
	{
		
		System.out.println("Area of shape is "+area);
		
	}
	
}
