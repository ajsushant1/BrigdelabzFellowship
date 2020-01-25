package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter year :");
		int year=sc.nextInt();
		
		if(year>1000 && year <10000)
		{
			if(year%4==0 || year%4000==0 && year%100!=0)
			{
				System.out.println(year+"is leap year");
			}
			else
			{
				System.out.println("not leap year");
			}
		}
		else
		{
			System.out.println("Enter valid format year");
		}
	}

}
