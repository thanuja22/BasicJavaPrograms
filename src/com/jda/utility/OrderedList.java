package com.jda.utility;

import java.io.IOException;
import java.io.PrintWriter;

public class OrderedList<T extends Comparable<T>> {
	public Node<T> head;
	 
	 public class Node<S>
	 {
		 S data;
		 Node<S> next;
		 
		 Node(S d){
			 data=d;
			 next=null;
		 }
	 }
	 

	public void add(T data) {
		// TODO Auto-generated method stub
		 
		Node<T> new_node=new Node<T>(data);
		new_node.next=head;
		head=new_node;
	}

	public void printList() {
		// TODO Auto-generated method stub
		
		Node<T> temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
		
			temp=temp.next;
			
		}
	}

	public void removeString(T key) {
		// TODO Auto-generated method stub
		Node<T> temp=head;
		Node<T> prev=null;
		if(temp!=null && ((temp.data).compareTo(key)==0))
		{
			head=temp.next;
			return;
			}
		while(temp!=null && ((temp.data).compareTo(key)!=0))
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
		{ 
			add(key);
		}
		else
		{
			prev.next=temp.next;
		}
	}
	public int getCount()
	{
		Node<T> temp=head;
		int count=0;
		while(temp!=null)
			{
			count++;
			temp=temp.next;
			}
		return count;
		
	}
	public void writeToFile() throws IOException
	{
		//File newFile=new File("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\DataStructurePrograms\\NewInteger.txt");
		
		PrintWriter pw=new PrintWriter("C:\\Users\\1022281\\git\\BasicJavaPrograms\\src\\com\\jda\\DataStructurePrograms\\Integer.txt");
		Node<T> temp=head;
		while(temp!=null)
		{
			
			pw.println(temp.data);
			temp=temp.next;
		}
		pw.close();
	}
	
	public void orderedAdd(T key) {
		Node<T> temp = head;
		
		Node<T> prev = null;

		while (temp != null && (key).compareTo(temp.data) <= 0) {
			
		prev = temp;
		temp = temp.next;
		
		}

		if (temp == head) {
			
		add(key);
		}
		else {
		if (temp == null) {
		Node<T> newnode = new Node<T>(key);
		prev.next = newnode;
		newnode.next = null;
		} 
		else {
			
		Node<T> newnode = new Node<T>(key);
		newnode.next = temp;
		prev.next = newnode;
		}
		}
		}

}
