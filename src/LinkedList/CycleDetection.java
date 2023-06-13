package LinkedList;

import java.util.List;

public class CycleDetection {

	Node head,temp;
	class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	
//	Implementation of BiginData
	void atTheBegin(int newData) {
		
		Node newNode = new Node(newData);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
//	Implementation of Cycle Detection
	void detectionLoop() {
		Node slow = head, fast = head;
		int flag = 0;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("No loop deteted");
		}else {
			System.out.println("loop is detected");
		}
	}
	
//	Implementation of Display Method
	void displayLL() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next; 
		}
	}
	
	public static void main(String[] args) {
		CycleDetection CLL = new CycleDetection();
		
		CLL.atTheBegin(2);
		CLL.atTheBegin(4);
		CLL.atTheBegin(8);
		CLL.atTheBegin(12);
//		CLL.displayLL();
//		Circular linkedList
		Node temp = CLL.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = CLL.head;
		CLL.detectionLoop();
	}

}
