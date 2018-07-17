package com.jda.functionalprograms;



import com.jda.utility.Utility;

public class TwoDimensionalArray {
public static void main(String args[])
{
	Utility array=new Utility();
	System.out.println("Number of rows, M :");
	int m=array.inputInt();
	System.out.println("Number of columns, N :");
	int n=array.inputInt();
	//calling methods
	int a[][]  =Utility.twoDimArrayInt(m,n);
	double b[][]  =Utility.twoDimArrayDouble(m,n);
	boolean c[][]  =Utility.twoDimArrayBoolean(m,n);
	        
	//calling display method
	Utility.display(a,b,c,m,n);
	
}
}
