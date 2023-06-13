package Stack;

import java.util.Stack;

public class StackImplementation {
	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<>();
		
//		push the element inside the stack
		stack1.push(2);
		stack1.push(4);
		stack1.push(6);
		stack1.push(9);
		
//		print the top most element in the stack
		System.out.println("The top most element in stack before deletion is: "+stack1.peek());
		
//		delete the top element from the stack
		stack1.pop();
		
//		print the top most element int the stack
		System.out.println("The top most element in stack After deletion is: "+stack1.peek());
		
//		search element int stack
		System.out.println("element 4 is present at the position: "+stack1.search(4));
		
//		check wheather stack is empty or not
//		empty function returns the boolean value (true/false)
		
		System.out.println("Is stack empty or not: "+stack1.empty());
	}
}
