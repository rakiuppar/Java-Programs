package com.programs.test;

public class SwapNumbers 
{

	public static void main(String[] args) 
	{
		int a = 1234;
		int b = 5678;
	
		a = a+b;
		b = a-b;
		a = a-b;
	
		System.out.println(a);
		System.out.println(b);
	}

}
