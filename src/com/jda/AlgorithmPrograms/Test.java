package com.jda.AlgorithmPrograms;



import java.util.Scanner;

import com.jda.utility.Utility;

public class Test {
	
	 public static void main(String[] args) {

	     Scanner scanner = new Scanner(System.in);

	     boolean keepGoing = true;

	     while(keepGoing) {
	       System.out.println("Month");
	       int m = scanner.nextInt();
	         if (m < 1 || m > 12) {
	           System.out.println("Months are between 1 and 12");
	           continue;
	         }

	       System.out.println("Day");
	       int d = scanner.nextInt();
	         if (d < 1 || d > 31) {
	            System.out.println("Days are between 1 and 31");
	            continue;
	         }

	       System.out.println("Year");
	       int y = scanner.nextInt();
	         if (y < -10000 || y > 10000) {
	            System.out.println("Years are between -10000 and 10000");
	            continue;
	         }

	        int y0 = y - (14 - m) / 12;
	        int x = y0 + y0/4 - y0/100 +y0/400;
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        int d0 = (d + x + 31 * m0 / 12) % 7;  
	        boolean c = 0 <= d0 && d0 <= 6;

	          if (c) {
	            String b = "Sunday";
	            System.out.println("The day of the week is " + b);
	          } else {
	            if (c) {
	              String b = "Monday";
	              System.out.println("The day of the week is " + b);
	            } else {
	              if (c) {
	                String b = "Tuesday";
	                System.out.println("The day of the week is " + b);
	            } else {
	              if (c) {
	                String b = "Wednesday";
	                System.out.println("The day of the week is " + b);
	              } else {
	                if (c) {
	                  String b = "Thursday";
	                  System.out.println("The day of the week is " + b);
	                } else {
	                  if (c) {
	                    String b = "Friday";
	                    System.out.println("The day of the week is " + b);
	                  } else {
	                    if (c) {
	                      String b = "Saturday";
	                      System.out.println("The day of the week is " + b);
	                    }
	                    
	                   }
	                  }
	               }
	             }
	             }
	            
	          } 

	        
	    }



	  }
	}
