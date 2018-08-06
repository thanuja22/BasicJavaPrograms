package com.jda.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.jda.utility.OrderedList;
import com.jda.utility.Utility;

public class OrderedListIntegers {
	public static void main(String args[]) throws Exception
	{
		OrderedList<Integer> list=new OrderedList<Integer>();
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		Utility u=new Utility();
		
		System.out.println("please enter the integer you want to search : ");
		int search=u.inputInt();
		
		FileReader file=new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\DataStructurePrograms\\Integer.txt");
		BufferedReader br=new BufferedReader(file);
		String line=null;
		
		while((line=br.readLine())!=null)
		{
			String[] values=line.split(",");
			for(String str:values)
			{
				arrayList.add(Integer.parseInt(str));
			}
		}
		br.close();
		Integer[] arr=new Integer[arrayList.size()];
		System.out.println("Integers read from the file");
		arr=arrayList.toArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		System.out.println("created a linked list");
		list.printList();
		list.removeString(search);
		
		System.out.println("linkedlist after removing the given string ");
		list.printList();
		System.out.println("changing the file");
		list.writeToFile();
		
		
		
		}
		
	}


