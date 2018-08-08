package com.jda.ObjectOrientedPrograms;

public class LinkedStack<T> {
	public static Company company = new Company();
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
			n.next=head;
			head=n;
		}
	}
	
	public void display() {
		Node<T> t=head;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
	}
	
	public void remove() {
		Node<T> t=head;
		head = t.next;
	}
	public String pop(){
		Node<T> t=head;
		String temp =  (String) t.data;
		head = t.next;
		return temp;
	}
	
	public static void main(String[] args) {
		LinkedStack<String> l = new LinkedStack<String>();
		l.add("A");
		l.add("V");
		l.display();
		System.out.println("==");
		l.display();
	}
}
