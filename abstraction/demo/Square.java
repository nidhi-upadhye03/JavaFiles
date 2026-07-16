package com.tns.abstraction.demo;

public class Square extends Shape {
	private float side;
	public Square()//initialized
    {
        side=2.0f;
    }
    public Square(float side)
    {
        this.side=side;
    }
	void calArea() {
		area=side*side;
	}
}
