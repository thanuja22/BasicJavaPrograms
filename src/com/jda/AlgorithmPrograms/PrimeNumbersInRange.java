package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class PrimeNumbersInRange {
	public static void main(String args[])
	{
		Utility range=new Utility();
		System.out.println("Enter the lower limit : ");
		int L=range.inputInt();
		System.out.println("Enter the upper limit : ");
		int U=range.inputInt();
		System.out.println("Prime numbers within the range : ");
		Utility.primeNumberSearch(L,U);
		
	}

}
