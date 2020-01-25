package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for N :");
		int noOfPower=sc.nextInt();
		 
		int power=2;
		for(int i=1;i<=noOfPower;i++)
		{
			power=power*2;
			System.out.println("Power of 2^"+i+"is "+power);
		}
		
	}

}
