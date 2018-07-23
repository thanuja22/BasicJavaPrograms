package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class InsertionSort {
	public static void main(String args[]) 
	{
		Utility u=new Utility();
		long startTimer=0;
	    long stopTimer=0;
		
		long startTime=u.start(startTimer);
		
		System.out.println("Enter no. of integers to be printed: ");
		int n=u.inputInt();
		 
		//create integer array
		
		System.out.println();	
		System.out.println("Enter the words to be printed: ");
		int b[]=u.input1DArray(n);
		
		//sort string array using Arrays.sort method
		System.out.println("Sorted order is: ");
		u.insertionSort(b);
	u.print1DArray(b);
	
	long stopTime=u.stop(stopTimer);
	long elapsed=u.getElapsedTime(startTime,stopTime);
	System.out.println(elapsed/1000);
	
	}
}
