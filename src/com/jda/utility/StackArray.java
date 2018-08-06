package com.jda.utility;

public class StackArray{
	
	int max=1000;
	char top;
	char a[]=new char[max];
	 public boolean isEmpty()
	 {
		 return (top<0);
	 }
	public StackArray()
	{
		top = '-1';
	}
	public boolean push(char x)
	{
		if(top>=(max-1))
		{
			System.out.println("Stack Overflow");
			return false;
		}
		else
		{
			a[++top]=x;
			return true;
		}
	}
	public char pop()
	{
		if(top<0)
		{
			System.out.println("stack underflow");
			return 0;
		}
		else
		{
			char x=a[top--];
			return x;
		}
	}
	public char peek() {
		// TODO Auto-generated method stub
		if()
		{
			System.out.println("Stack empty");
			
		}
		else
			char x=a
		return x;
			
	}
	
	

}
