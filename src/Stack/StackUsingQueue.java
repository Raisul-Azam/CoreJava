package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	static Queue<Integer> q1 = new LinkedList<>();
	static Queue<Integer> q2 = new LinkedList<>();
	
//	to add a new element in the stack
//	time complexicity: O(n)
	static void add(int data) {
//		move all the element from q1 to q2
		while(!q1.isEmpty()){
			q2.add(q1.peek());
//			poll method is also used to remove the element from the queue
//			return null when the queue is empty
			q1.poll();
		}
		
//		push the new data q1
		q1.add(data);
		
//		move back all element from q2 to q1
		while(!q2.isEmpty()) {
			q1.add(q2.peek());
			q2.poll();
		}
	}
	
//	to delete the element from the stack
//	time complexicity: O(1)
	static int remove() {
		if(q1.isEmpty()) {
			System.out.println("Queue is underflow");
		    System.exit(0);
		}
		
		int ele = q1.remove();
		q1.poll();
		return ele;
	}
	
	
	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
//		push all the elements from the stack
		s.add(2);
		s.add(5);
		s.add(9);
		s.add(12);
		
//		pop all the elements from the stack
//		LIFO :- last in first out
		System.out.println("Deleted element from the stack is: "+ s.remove());
	}

}
