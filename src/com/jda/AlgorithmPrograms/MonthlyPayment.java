package com.jda.AlgorithmPrograms;

import com.jda.utility.Utility;

public class MonthlyPayment {
	public static void main(String args[])
	{
		Utility u=new Utility();
		
		System.out.println("enter the principal : ");
		double P=u.inputDouble();
		
		System.out.println("enter the years : ");
		double Y=u.inputDouble();
		
		System.out.println(" enter the rate of interest :");
		double R=u.inputDouble();
		
		double payment=u.monthlypayment(P, Y, R);
		System.out.println("The monthly payment is : " +payment);
				
	}

}
