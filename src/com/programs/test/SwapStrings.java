package com.programs.test;

public class SwapStrings 
{

	public static void main(String[] args) 
	{
		String a = "Welcome to";
		String b = "Java Programming";
		
		a = a + b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);

	}

}
