package com.jda.utility;
/**
 * 
 */
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	
/**
 * default constructor for  scanner
 */
	public Utility() {
		scanner = new Scanner(System.in);
	}
/**
 * Method for replace string
 * @return
 */
	public String inputString(){
		return scanner.next();
		
	}
	/**
	 * method for leap year
	 * @return
	 */
	public int inputInt()
	{
		
		return scanner.nextInt();
	}
	/**
	 * method for power of 2
	 * @return
	 */
	public int inputIndex()
	{
		return scanner.nextInt();
	}

	public String replaceString(String template, String name) {
		template = template.replace("<<Username>>", name);
		return template;

	}

}
