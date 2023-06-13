package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeImp {
	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addLast(5);
		dq.addLast(7);
		dq.addLast(9);
		
		System.out.println("Deque output look Likes: "+dq);
		
		dq.removeFirst();
		System.out.println("deque output look likes after deletion: "+dq);
	}
}
