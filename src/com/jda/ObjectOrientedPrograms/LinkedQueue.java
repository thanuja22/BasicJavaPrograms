package com.jda.ObjectOrientedPrograms;

public class LinkedQueue<T> {
	public class Node<T> {
		public Node<T> next;
		public T data;
		public Node(T data) {
			this.data=data;
		}
	}
	Node<T> head;
	public void add(T data) {
		Node<T> n = new Node<T>(data);
		if(head==null)
			head=n;
		else {
			Node<T> t=head;
			while(t.next!=null)
				t=t.next;
			t.next=n;
		}
	}
	
	public void display() {
		Node<T> t=head;
		Integer a=10;
		if(!isEmpty()) {
		while(t!=null) {
			
			if(!(t.data.equals(-1))) {
				if((((Integer) t.data)).compareTo(a)<0){
					System.out.print(t.data+"  ");
				}
				else
					System.out.print(t.data+" ");
			}
			else
				System.out.print("   ");
			t=t.next;
			}
		System.out.println();
		}
	}
	
	public T remove() {
		Node<T> t=head;
		if(head!=null)
			head = t.next;
		return t.data;
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
	
	

}
