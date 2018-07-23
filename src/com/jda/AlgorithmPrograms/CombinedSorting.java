package com.jda.AlgorithmPrograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class CombinedSorting {
public static void main(String args[])
{
	Utility u1=new Utility();
	System.out.println("lowerlimit : ");
	int l=Utility.inputInt();
	System.out.println("upperlimit : ");
	int u=Utility.inputInt();
	ArrayList<Integer> a=u1.primeNumberSearch(l, u);
	int n=a.size();
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			
		}
	}
}
}
