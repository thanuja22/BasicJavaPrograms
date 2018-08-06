package com.jda.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import com.jda.utility.Utility;

import com.jda.utility.UnorderedList;

public class UnorderedLinkedList {
	public static void main(String args[]) throws Exception
	{
		UnorderedList<String> list=new UnorderedList<String>();
		Utility u=new Utility();
		System.out.println("enter the string to be searched : ");
		String[] values=null;
		int count=0;
		String string=u.inputString();
		FileReader file=new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\DataStructurePrograms\\Data.txt");
		BufferedReader br=new BufferedReader(file);
		String line = null;
		while ((line = br.readLine()) != null) {
			values = line.split(",");
			
			
			for (String str : values) {
				list.add(str);
				
			}
	}
		
		br.close();
		
		
		System.out.println("created a linked list");
		list.printList();
		list.removeAt(string);
		
		System.out.println("linkedlist after removing the given string ");
		list.printList();
		
		System.out.println("changing the file");
		list.writeToFile();
		
	}

}
