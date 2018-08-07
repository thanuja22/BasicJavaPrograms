package com.jda.ObjectOrientedPrograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class DeckOfCards {
	public static void main(String args[])
	{
		String suits[]={"clubs", "diamonds", "hearts", "spade"};
		String rank[]={"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};
		String cards[]=new String[52];
		int k=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<13;j++)
			{
				cards[k]=suits[i]+rank[j];
				//System.out.println(cards[k]);
				k++;
			}
		}
		ArrayList<String> per1=new ArrayList<String>();
		ArrayList<String> per2=new ArrayList<String>();
		ArrayList<String> per3=new ArrayList<String>();
		ArrayList<String> per4=new ArrayList<String>();
		int cnt=0;
		Utility util=new Utility();
		util.cards(0,cards,per1);
		util.cards(0,cards,per2);
		util.cards(0,cards,per3);
		util.cards(0,cards,per4);
		
		String[][] rslt=new String[4][9];
		util.fill(0,rslt,per1);
		util.fill(1,rslt,per2);
		util.fill(2,rslt,per3);
		util.fill(3,rslt,per4);
		
		
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<9;j++)
				{
					System.out.print(rslt[i][j] +" ");
				}
				System.out.println();
			}
		
	}
}
