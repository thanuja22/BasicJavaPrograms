package com.jda.AlgorithmPrograms;

import java.util.Arrays;

import com.jda.utility.Utility;

public class BinarySearchString {
	public static void main(String[] args)
	{
		 
		Utility u=new Utility();
		System.out.println("Enter number of words to be sorted: ");
		int arraySize1=u.inputInt();
		String b[]=u.input1DStringArray(arraySize1);
		Arrays.sort(b);									//sorting the array
		System.out.println();

		System.out.println("The Sorted Order is: ");
		u.print1DStringArray(b);						//printing the sorted array
		System.out.println();

		System.out.println("Enter Key: ");
		int p=u.binarySearchString(b,u.inputString());

		if(p==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+p+" position");
		}	        
	}

}
