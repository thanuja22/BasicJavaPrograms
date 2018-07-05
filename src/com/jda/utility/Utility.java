package com.jda.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public String inputString(){
		return scanner.next();
		
	}
	public int inputInt()
	{
		
		return scanner.nextInt();
	}

	public String replaceString(String template, String name) {
		template = template.replace("<<Username>>", name);
		return template;

	}

}
