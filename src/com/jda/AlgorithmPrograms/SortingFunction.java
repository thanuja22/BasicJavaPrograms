package com.jda.AlgorithmPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.jda.utility.Utility;

public class SortingFunction {
	public static void main(String args[])
	{
		//object instance
		Utility u=new Utility();
		
		//long order[]=new long[6];
		
		//Binary search of integers
		long startBi=u.startTimer();
		System.out.println("Enter size: ");
		int arraySize=u.inputInt();
		int a[]=u.input1DArray(arraySize);
		Arrays.sort(a);								//sorting the array
		System.out.println();
		System.out.println("The Sorted Order is: ");
		u.print1DArray(a);							//printing the sorted array
		System.out.println();
		System.out.println("Enter Key: ");
		int key=u.inputInt();
		int position=u.binarySearch(a,key);

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
		long stopBi=u.stopTimer();
		long t1=u.elapsedTime(startBi, stopBi);
		//Binary search of strings
		
		long startBs=u.startTimer();
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
		long stopBs=u.stopTimer();
		long t2=u.elapsedTime(startBs, stopBs);
		
		//Insertion sort in integers
		
		System.out.println("Enter no. of integers to be printed: ");
		int n=u.inputInt();
		 
		//create integer array
		
		long startI=u.startTimer();
		
		System.out.println();	
		System.out.println("Enter the words to be printed: ");
		int c[]=u.input1DArray(n);
		
		//sort string array using Arrays.sort method
		System.out.println("Sorted order is: ");
		u.insertionSort(c);
	    u.print1DArray(c);
	    long stopI=u.stopTimer();
		long t3=u.elapsedTime(startI, stopI);
	    
	    //Insertion sort in strings
		
		long startIs=u.startTimer();
	    
	    System.out.println("Enter no. of words to be printed: ");
		int N=u.inputInt();
		 
		//create string array
		
		System.out.println();	
		System.out.println("Enter the words to be printed: ");
		String d[]=u.input1DStringArray(N);
		
		//sort string array using Arrays.sort method
		System.out.println("Sorted order is: ");
		String string[]=u.insertionSortString(d);
		u.print1DStringArray(string);
		
		long stopIs=u.stopTimer();
		long t4=u.elapsedTime(startIs, stopIs);
		
		//bubble sort in integers
		
		long startBui=u.startTimer();
		
		System.out.println("Enter the length of array : ");
		int N1=u.inputInt();
		System.out.println("Enter the elements of array :");
		int arr[]=u.arrayInput(N1);
		int[] array=u.bubbleSort(arr);
		u.printArray(array);
		
		long stopBui=u.stopTimer();
		long t5=u.elapsedTime(startBui, stopBui);
		
		//bubble sort in strings
		
		long startBus=u.startTimer();
		
		System.out.println("Enter no. of words to be printed: ");
		int N2=u.inputInt();
		 
		//create string array
		
		System.out.println();	
		System.out.println("Enter the words to be printed: ");
		String s1[]=u.input1DStringArray(N2);
		
		//sort string array using Arrays.sort method
		System.out.println("Sorted order is: ");
		String s[]=u.bubbleSortString(s1);
		u.print1DStringArray(s);
		
		long stopBus=u.stopTimer();
		long t6=u.elapsedTime(startBus, stopBus);
		
		long Time[]= {t1,t2,t3,t4,t5,t6};
		Arrays.sort(Time);
		System.out.println(Time);
	}

}
