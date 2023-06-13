// Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
// new node is inserted after the given node.

package LinkedListAsgQues;

import java.util.Scanner;

public class PositionNode {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}

//	Implementation of atThe End
	public void atTheEnd(int newData) {
		Node newNode = new Node(newData);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = null;
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		
	}
	
//	Implementation of Insert any position
	public void atTheAnyPosition(int position, int newDta) {
		Node newNode = new Node(newDta);
		// linkedlist is empty
        if(head == null){
            return;
        }

        Node temp1 = head;

        for(int i=0; temp1 != null && i<position-1; i++){
            temp1 = temp1.next;
        }
        
        newNode.next = temp1.next;
        temp1.next = newNode;
	}
	
//	Implementation of Display Linked List
	public void DisplayLL() {
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+" ");
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PositionNode pNode = new PositionNode();
		
		pNode.atTheEnd(3);
		pNode.atTheEnd(5);
		pNode.atTheEnd(6);
		pNode.atTheEnd(8);
		pNode.atTheEnd(12);
		
		System.out.print("Before Change Linked List: ");
		pNode.DisplayLL();
		
		System.out.println();
		
		System.out.print("Enter the position: ");
		int pos = sc.nextInt();
		
		System.out.print("Enter the Value: ");
		int val = sc.nextInt();
		
		pNode.atTheAnyPosition(pos,val);
		System.out.print("After Change Linked List: ");
		pNode.DisplayLL();
		
		
	}

}
