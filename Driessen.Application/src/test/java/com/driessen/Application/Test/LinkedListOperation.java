package com.driessen.Application.Test;

import java.util.LinkedList;

public class LinkedListOperation {
	
	//How to delete all elements from my LinkedList?
	
	public static void main(String args[]) {
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("rajesha");
		ll.add("ram");
		ll.add("shyam");
		
		System.out.println("actual linked list: "+ll);
		
		ll.clear();
		
		System.out.println("after deletion: "+ll);
	}

}
