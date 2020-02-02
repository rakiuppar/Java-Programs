package com.programs.test;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s = "Reverse String Java Program";
		String reverse="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
