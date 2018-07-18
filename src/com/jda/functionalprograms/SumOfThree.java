package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class SumOfThree {
	public static void main(String args[])
	{
		Utility three=new Utility();
		System.out.println("length of the array : ");
		int size=three.inputInt();
		System.out.println("array entries : ");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=three.inputInt();
		}
		int sum=three.sumOfThree(size,arr);
		System.out.println("No.of triplets: "+sum);
		System.out.println();
		
	}

}
