package javapractices;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {

		Queue<Integer> q1 = new PriorityQueue<Integer>();
		
		q1.add(45);
		q1.add(55);
		q1.add(66);
		q1.add(78);
		q1.add(98);
		
		Iterator<Integer> itr3 = q1.iterator();
		
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		
		System.out.println("###############################");
		
		//peek(): Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.
	    System.out.println("Peek( : )"+q1.peek()); //op: 45
		
	    System.out.println("###############################");
	    
	    //poll(): Retrieves and removes the head of this queue,or returns null if this queue is empty.
	    System.out.println("poll() : "+ q1.poll());

	    System.out.println("###############################");
	    
	    System.out.println(q1);
	}

}
