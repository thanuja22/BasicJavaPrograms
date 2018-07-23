package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class Question {
	public static void main(String[] args) {
		Utility u=new Utility();
		
        int k = u.inputInt();
        int n = (int) Math.pow(2, k);
        
        System.out.println("Think of an integer between 0 and "+n+" :");
       int m=u.inputInt();
        int secret = u.search(0, n);
        System.out.println("Your number is \n"+ secret);
    }

}
