package com.jda.AlgorithmPrograms;

import java.util.Arrays;

import com.jda.utility.Utility;

public class BinarySearch {
	public static void main(String args[])
	{
		  
		Utility u=new Utility();

		System.out.println("Enter size: ");
		int arraySize=u.inputInt();
		int a[]=u.input1DArray(arraySize);
		Arrays.sort(a);								//sorting the array
		System.out.println();
		System.out.println("The Sorted Order is: ");
		u.print1DArray(a);							//printing the sorted array
		System.out.println();
		System.out.println("Enter Key: ");
		int position=u.binarySearch(a,u.inputInt());

		if(position==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+position+" position");
		}
	}

}
