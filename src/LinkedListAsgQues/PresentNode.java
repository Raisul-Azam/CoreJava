// Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.

package LinkedListAsgQues;

import java.util.Scanner;

public class PresentNode {

	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
//	Implementation of at The Last Linked List
	public void atTheLast(int newData) {
		Node newNode = new Node(newData);
//		LinkedList is empty
		if (head == null) {
			head = newNode;
			return;
		}
//		LinkedList is not empty
		newNode.next = null;
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return;
	}
	
//	Implementation of Node present or Not
	public void isPresent(int x) {
		int flag = 0;
		if (head == null) {
			System.out.println("No");
		}
		Node checkNode = head;
		while(checkNode != null) {
			if(checkNode.data == x) {
				flag = 1;
				break;
			}
			checkNode = checkNode.next; 
		}
		if (flag == 0) {
			System.out.println("No");
		}else {
			System.out.println("yes");
		}
		
		
	}
	
//	Implementation of Display Method
	public void displayLL() {
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+ " ");
			currNode = currNode.next;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PresentNode pNode = new PresentNode();
		
		pNode.atTheLast(14);
		pNode.atTheLast(21);
		pNode.atTheLast(11);
		pNode.atTheLast(30);
		pNode.atTheLast(10);
		
		pNode.displayLL();
		System.out.println();
		System.out.print("Enter the target: ");
		int x = sc.nextInt();
		pNode.isPresent(x);
		
	}

}





//_________________________________________________________________________________________________________

//class LinkedList {
//    class Node {
//    	int data;
//    	Node next;
//	    Node(int d)	{
//		data = d;
//		next = null;
//	    }
//    }
//
//	Node head; 
//
//	// Inserts a new node at the front of the list
//	public void push(int new_data)	{
//		Node new_node = new Node(new_data);
//		new_node.next = head;
//		head = new_node;
//	}
//
//	// Checks whether the value x is present in linked list
//	public boolean search(Node head, int x)
//	{
//		Node current = head; 
//		while (current != null) {
//			if (current.data == x)
//				return true; // data found
//			current = current.next;
//		}
//		return false; // data not found
//	}
//	public static void main(String args[]){
//		LinkedList llist = new LinkedList();
//
//		llist.push(21);
//		llist.push(22);
//		llist.push(11);
//		llist.push(43);
//		llist.push(23);
//
//		if (llist.search(llist.head, 21))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
//	}
//}