package com.jda.utility;

import java.util.Scanner;

public class Utility {

	
	public String Input()
	{
		System.out.println("Enter your name: ");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		scanner.close();
		return name;
	}
	public String replaceString(String template, String name){
		template = template.replace("<<Username>>",name);
		return template;
		
			
	}

	

}
