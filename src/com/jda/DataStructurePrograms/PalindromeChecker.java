package com.jda.DataStructurePrograms;



import com.jda.utility.Dequeue;
import com.jda.utility.Dequeue.DqNode;
import com.jda.utility.Utility;

public class PalindromeChecker {
	
	public static boolean palindromechecker(char[] inputarray) {
		Dequeue<Character> dq = new Dequeue<Character>();
		for(int i=0;i<inputarray.length;i++)
		{
			dq.insertEnd(inputarray[i]);
			
		}
		
		while (dq.size > 1) {
			DqNode<Character> first = dq.deleteFront();
			DqNode<Character> last = dq.deleteEnd();
			if (first.value != last.value)
				return false;
		}
		return true; 
	}

	public static void main(String args[]) {
		System.out.println("please enter the string");

		Utility utility = new Utility();
		String input = utility.inputString();
		//Consider the input MADAM 
		char[] inputarray = input.toCharArray();
		   
		//resulting array |M|A|D|A|M|
		
		boolean bool = palindromechecker(inputarray);
		if (bool)
			System.out.println("Entered string is a palindrome");
		else
			System.out.println("entered string is not a palindrome");
	}

}
