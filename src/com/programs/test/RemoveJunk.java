package com.programs.test;

public class RemoveJunk 
{

	public static void main(String[] args) 
	{
		String s = "Welcome to Java $*&&&&*programming23";

		System.out.println("Removing Junk characters: "+ s.replaceAll("[^A-Za-z0-1]", ""));
		System.out.println("Keeping only Junk values: "+ s.replaceAll("[a-zA-Z0-9]", ""));
		String vowels = s.replaceAll("[^a,e,i,o,u]", "");
		System.out.println(vowels.length());


	}

}
