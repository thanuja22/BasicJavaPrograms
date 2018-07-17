package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class PrimeFactors {
	

	public static void main(String args[]){
		Utility factor=new Utility();
		System.out.println("Enter the number :");
		int number=factor.inputInt();
		System.out.println("prime factors are : ");
		Utility.primefactors(number);
	}

}
