package com.bridgelabz.basiccore;


import com.bridgelabz.utility.Utility;

public class FlipCoinPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int output[]=new int [2];
		System.out.println("Enter Flip count for coin :");
		int flipCount=Utility.inputNumber();
		
		output=Utility.percentageOfFlipCoin(flipCount);
		System.out.println("Head percentage is:"+output[0]);
		System.out.println("tail percentage is:"+output[1]);
		
	}

}
