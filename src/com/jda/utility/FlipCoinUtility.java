package com.jda.utility;

public class FlipCoinUtility {
	
	public int flipCoinUtility(int i) {

	if(Math.random()<0.5)
	{
		System.out.println("tails");
	 i=0;
		
	}
	else 
	{
		System.out.println("heads");
		i=1;
		
	
	}
	return i;
}
}
