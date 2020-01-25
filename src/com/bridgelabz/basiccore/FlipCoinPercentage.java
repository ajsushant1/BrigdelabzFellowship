package com.bridgelabz.basiccore;

import java.util.Scanner;

public class FlipCoinPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility ut=new Utility();
		Scanner sc=new Scanner(System.in);
		int output[]=new int [2];
		System.out.println("Enter Flip count for coin :");
		int flipCount=sc.nextInt();
		output=ut.percentageOfFlipCoin(flipCount);
		System.out.println("Head percentage is:"+output[0]);
		System.out.println("tail percentage is:"+output[1]);
		
	}

}
