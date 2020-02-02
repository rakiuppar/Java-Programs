package com.programs.test;

public class ReverseWords 
{

	public static void main(String[] args) 
	{
		String s1 = "Welcome to Java programming";
		
		String[] ls = s1.split(" ");
		String rev ="";
		for(String a : ls)
		{
			StringBuffer sb = new StringBuffer(a);
			rev = rev+ sb.reverse() + " ";
		}
		
		System.err.println(rev);

	}

}
