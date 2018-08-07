package com.jda.ObjectOrientedPrograms;

import java.util.LinkedList;
import java.util.Queue;



public class Player {
	public static void main(String args[])
	{
		String suits[]={"clubs", "diamonds", "hearts", "spade"};
		String rank[]={"02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14"};
		String cards[]=new String[52];
		int k=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				cards[k]=rank[j]+suits[i];
				k++;
			}
		}
		
		
		Queue<String> q=new LinkedList<String>();
		for(int i=0;i<4;i++)
		{
			System.out.println("person " +i);
			PlayerDetails player= new PlayerDetails();
			player.add(cards);
			player.sort();
			player.remove();
			System.out.println();
		}
		
		
		
	}

}
