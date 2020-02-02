package com.programs.test;

public class PrintNosUsingRecursive 
{

	public static void main(String[] args) 
	{
		printNumbers(5);
		
	}

	
	public static void printNumbers(int n)
	{
		if(n>0)
		{
			printNumbers(n-1);
			System.out.println(n);
		}
	}
}
