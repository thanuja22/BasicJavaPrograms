package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class BubbleSort {
public static void main(String args[])
{
	Utility bubble=new Utility();
	System.out.println("Enter the length of array : ");
	int N=bubble.inputInt();
	System.out.println("Enter the elements of array :");
	int arr[]=bubble.arrayInput(N);
	int[] array=bubble.bubbleSort(arr);
	bubble.printArray(array);
	
}
}
