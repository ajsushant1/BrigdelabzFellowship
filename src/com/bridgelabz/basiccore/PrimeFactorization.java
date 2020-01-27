package com.bridgelabz.basiccore;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class PrimeFactorization {

	public static void main(String[] args) {
		
		System.out.println("Enter number to find prime factorization :");
		int input=Utility.inputNumber();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al=Utility.primeFactorization(input);
		System.out.println(al);
	}

}
