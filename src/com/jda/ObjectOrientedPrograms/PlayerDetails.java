package com.jda.ObjectOrientedPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;




public class PlayerDetails {
public class playerDetails{
		
		
	}
	//Que que=new Que();
	Queue<String> que=new LinkedList<String>();
	LinkedList<String> l=new LinkedList<String>();
	ArrayList<String> per=new ArrayList<String>();
	public void add(String cards[])
	{
	int cnt=0;
	while(cnt<9)
	{
		int value=(int) ( Math.random() *52);
		if(cards[value]!=null)
		{
		//	per1.add(cards[value]);
			l.add(cards[value]);
			per.add(cards[value]);
			
			//que.enqueue(cards[value], 0);
			cards[value]=null;
			cnt++;
		}
		
	}
	}
	public void sort()
	{
		
		Collections.sort(per);
		for(int i=0;i<9;i++)
		{
			String st=per.get(i);
			que.add(st);
		}
	}
	public void remove()
	{
		for(int i=0;i<9;i++)
		{
			String s=que.remove();
			System.out.print(s+" ");
		}
	}
}
