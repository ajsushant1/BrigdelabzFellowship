package com.bridgelabz.basiccore;


import com.bridgelabz.utility.Utility;

public class ReplaceName {

	public static void main(String[] args) {
				
		System.out.println("Enter your name :");
		String username=Utility.inputString();
		System.out.println(Utility.replaceName(username));
	}

}
