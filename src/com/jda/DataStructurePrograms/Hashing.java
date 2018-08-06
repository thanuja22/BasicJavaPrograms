package com.jda.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.jda.utility.OrderedList;
import com.jda.utility.Utility;

public class Hashing {

	
		public static void main(String args[]) throws IOException
        {
			HashMap<Integer, OrderedList<Integer>> slot = new HashMap<>(); //create a hashmap
			for (int i = 0; i < 11; i++) {
				slot.put(i, null); //initiate a map with each key value null given in the loop
			}

			ArrayList<Integer> templist = new ArrayList<Integer>(); // create an arraylist
			Utility utility = new Utility(); // create a utility object
			System.out.println("please enter the integer you want to search");
			int search = utility.inputInt(); //search integer
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\DataStructurePrograms\\Integer.txt")); //read the file
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(","); //Splitting the line separated by comma into a string array
				for (String str : values) {
					templist.add(Integer.parseInt(str)); //add all the elements in values to the arraylist
				}
			}
			br.close();
			Integer[] arr = new Integer[templist.size()]; //create a new array equal to the size of arraylist
			System.out.println("Integers read from the file");
			arr = templist.toArray(arr); //convert the arraylist to an array
			// print the contents of the file
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
			
			for (int i = 0; i < arr.length; i++) {
				Integer remainder = arr[i] % 11; //Integer type key here is remainder
				if (slot.get(remainder) == null) {
					System.out.println(remainder);
					OrderedList<Integer> list = new OrderedList<Integer>();
					slot.put(remainder, list);
					list.orderedAdd(arr[i]);
					
				} else {
					slot.get(remainder).orderedAdd(arr[i]);
				}
			}
			System.out.println("THE SLOTS ARE:-");

			for (int i = 0; i < arr.length; i++) {
				if (slot.get(i) == null)
					System.out.println("slot is empty");
				else {
					System.out.println("slot--" + i);
					slot.get(i).printList();
				}

			}
			int remsearch = search % 11;
			slot.get(remsearch).removeString(search);
			
			System.out.println("the slots after removing");
			for (int i = 0; i < arr.length; i++) {
				if (slot.get(i) == null)
					System.out.println("slot is empty");
				else {
					System.out.println("slot--" + i);
					slot.get(i).printList();
				}

			}
		}

  	}
		
		
	

