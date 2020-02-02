package com.programs.test;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int num = 12;
		int count = 0;
		
		if(num<2)
			System.out.println("Enter a valid number");
		
		else
		{
			for(int i =2; i<=num; i++)
			{
				if(num%i == 0)
					count++;
			}
			
			if(count == 1)
				System.out.println("Prime Number");
			else
				System.out.println("Not a Prime Number");
		}
	}

}
