package com.jda.AlgorithmPrograms;

import java.util.Scanner;

import com.jda.utility.Utility;

public class TemperatureConversion {
public static void main(String args[])
{
	Utility u=new Utility();
	System.out.println("is temp in centigrade?");
	Scanner scanner=new Scanner(System.in);
	boolean temp=scanner.hasNext();
	double temperature=u.inputInt();
	u.temperaturConversion(temperature,temp);
}
}
