package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class dQueueImplementation {

	public static void main(String[] args) {
		 Queue<Integer> q = new LinkedList<>();
		 
//		 to add the data inside the queue - enqueue
		 for(int i=0; i<10; i++) {
			 q.add(i);
		 }
		 
		 System.out.println("q data look likes: "+q);
		 
//			to display the top element present in the queue
			System.out.println("The top element in the queue Before deletion is: "+q.peek());
		 
//		 to remove the element from the queue - dequeue
		q.remove();
		
//		to display the top element present in the queue
		System.out.println("The top element in the queue After deletion is: "+q.peek());
		
//		to check the size of the queue
		System.out.println("The current size of the queue "+q.size());
	}

}
