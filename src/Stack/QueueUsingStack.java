//Implementation of Queue data structue using stack
//Time complexicity of enQueue: O(1)
//Time compexicity of dequeue: O(n)
//space complexicity of : O(n)

package Stack;

import java.util.Stack;

public class QueueUsingStack {

	static Stack<Integer> stack1 = new Stack();
	static Stack<Integer> stack2 = new Stack();
	
//	Insertion of the data in the Queue
//	TimeComplexicity : O(1)
	static void enQueue(int data) {
		stack1.add(data);
	}
	
//	deletion of the data from the queue - FIFO
	static int deQueue() {
		int ele;
		if(stack1.empty() && stack2.empty()) {
			System.out.println("Queue is empty");
		}
		
//		push all the data from the stack1 to stack2
//		Time complexicity : O(n)
		if(stack2.empty()) {
			while(!stack1.empty()) {
				ele = stack1.pop();
				stack2.push(ele);
			}
		}
		
//		pop the top element from the stack2
//		FIFO - First in First out
		ele = stack2.pop();
		return ele;
	}
	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		
//		function calling for insertion in the queue
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		
//		function calling for deletion of an element from the queue
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

}
