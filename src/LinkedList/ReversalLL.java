package LinkedList;

public class ReversalLL {

	static Node head;
	class Node {
		
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
		
	}
	
//	Implementation of at The End.
	public void atTheEnd(int newData) {
		
		Node newNode = new Node(newData);
		Node temp = head;
		
//		when will be node empty.
		if(head==null) {
			head = newNode;
			return;
		}
		
//		then, when will not be empty
		newNode.next = null;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return;
		
	}
	
//	Implementation of Reverse
//	public void atTheReverse() {
//		Node curr = head;
//		Node prev = null;
//		Node nextptr = null;
//		
//		while(curr != null) {
//			nextptr = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = nextptr;
//		}
//		head = prev;
//	}
	
//	Implemetation of recursive approach
	public void atTheRecursive(Node curr, Node prev) {
		if(curr.next == null) {
			head = curr;
		    curr.next = prev;
			return;
		}
		Node nextPtr = curr.next;
		curr.next = prev;
		atTheRecursive(nextPtr, curr);
 	}
	
//	Implementaion of Middle of LinkedList
	public void atTheMiddle() {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

//	Implementation of Display method
	void displayLL() {
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(+currNode.data+" ");
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) {
		
		ReversalLL rLL = new ReversalLL();
		
		rLL.atTheEnd(2);
		rLL.atTheEnd(4);
		rLL.atTheEnd(8);
		rLL.atTheEnd(4);
		rLL.atTheEnd(2);
//		rLL.atTheEnd(20);
		
		System.out.print("Before reverse: ");
		rLL.displayLL();
		System.out.println();
		
//		rLL.atTheReverse();
		rLL.atTheRecursive(head, null);
		System.out.print("After reverse: ");
		rLL.displayLL();
//		System.out.println();
//		System.out.print("Middle of a Node: ");
//		rLL.atTheMiddle();
	}

}
