package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Scanner;

public class Utility {
	
	static Scanner scanner=new Scanner(System.in);
	
	//for integer input
	public static int inputNumber()
	{
		int number;
		
		return number=scanner.nextInt();
		
	}
	//for String input
	public static String inputString()
	{
		String input=scanner.next();
		return input;
	}
	
	//to replace String
	public static String replaceName(String username)
	{
		String main="Hello <<username>>,How are you?";
		String output=main.replace("<<username>>", username);
		return output;
	}
	
	
	//to calculate percentage of flipped coin
	public static int [] percentageOfFlipCoin(int flipCount)
	{
		int headPercentage,tailPercentage,head=0,tail=0,random;
		
		int [] ans=new int[2];
		for(int i=1;i<=flipCount;i++)
		{
			random=(int)(Math.random()*9);
			
			if(random>5)
			{
				head++;
			}
			else
			{
				tail++;
			}
		}
		headPercentage=(head*100)/flipCount;
		tailPercentage=(tail*100)/flipCount;
		ans[0]=headPercentage;
		ans[1]=tailPercentage;
		return ans;
	}
	
	//to calculate harmonic value
	public static float harmonicValue(int n)
	{
		float harmonicValue=0;
		for(int i=1;i<=n;i++)
		{
			harmonicValue=harmonicValue +(float)1/i;
		}
		return harmonicValue;
	}
	
	//to calculate prime factorization

	public static ArrayList<Integer> primeFactorization(int n)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=2;i<=n;)
		{			
			if(n%i==0)
			{
				 n=n/i;
				 al.add(i);
				
			}
			else
			{
				i++;
			}
		}
		return al;
	}
}
