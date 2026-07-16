package com.tns.exceptiondemo;

import java.util.Scanner;

public class MultipleCatchDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		System.out.println("enter the number 2");
		int divisor=sc.nextInt();
		
		int result=num/divisor;
		System.out.println("Result="+result);
		
	}
catch(NumberFormatException e) {
	System.out.println("invalid input please give numbers only");
}
catch(ArithmeticException e) {
	System.out.println("divide by zero exeception");

}
catch(Exception e) {
	System.out.println();
}

	}

}
