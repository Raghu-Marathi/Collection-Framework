package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Test {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("hyderbad");
		queue.add("mumbai");
		queue.add("banglore");
		queue.add("chennai");
		
		System.out.println(queue);
		
		System.out.println(queue.element()); // Retrieves, but does not remove, the head of this queue.
		System.out.println(queue.peek()); // Retrieves, but does not remove, the head of this queue.
		
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		String remove = queue.remove();
		System.out.println(remove);
		
		System.out.println(queue.poll());  // Retrieves and removes the head of this queue,or returns null if this queue is empty
		
		
		
	}

}
