package com.bridgelabz.basiccore;


import com.bridgelabz.utility.Utility;

public class HarmonicValue {

	public static void main(String[] args) {
				
		System.out.println("Enter limit for harmonic series :");
		
		int limit=Utility.inputNumber();
		float output=Utility.harmonicValue(limit);
		
		System.out.println(output);
	}
}
