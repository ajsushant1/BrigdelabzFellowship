package com.bridgelabz.basiccore;

import java.util.Scanner;

public class ReplaceName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility ut=new Utility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String username=sc.next();
		System.out.println(ut.replaceName(username));
	}

}
