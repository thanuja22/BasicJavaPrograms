package com.jda.AlgorithmPrograms;

import java.util.Scanner;

import com.jda.utility.Utility;

public class Sqrt {
	 public static void main(String[] args) {
		 Utility u=new Utility();
		 Scanner scanner=new Scanner(System.in);
		 double c=scanner.nextDouble();
		 double t=u.sqrt(c);
		 System.out.println("sqrt is "+t);
	 }

}
