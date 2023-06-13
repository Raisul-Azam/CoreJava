// Q3. Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
//  Return the linked list sorted as well.

package LinkedListAsgQues;

public class RemoveDuplicates {
	
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
//	Implementation of atTheEnd
	public void atTheEnd(int newData) {
		Node newNode = new Node(newData);
		
//		Node is empty
		if(head == null) {
			head = newNode;
			return;
		}
		
//		Node is not empty
		newNode.next = null;
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;

	}
	
	public void removeDuplicates() {
		
		 if(head == null || head.next == null)
	            return ;
	        Node curr = head;
	        
	        while( curr != null && curr.next != null){
	           
	            if(curr.data == curr.next.data){
	                curr.next = curr.next.next;
	            }
	            else{
	                curr = curr.next; 
	            }
	        }
	        return;
	}
	
//	Implementation of DisplayLL
	public void DisplayLL() {
		Node currNode = head;
		while(currNode != null){
			System.out.print(currNode.data+" ");
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		
		RemoveDuplicates rd = new RemoveDuplicates();
		
		rd.atTheEnd(1);
		rd.atTheEnd(1);
		rd.atTheEnd(2);
		rd.atTheEnd(3);
		rd.atTheEnd(3);
		
		System.out.print("Before Linked List: ");
		rd.DisplayLL();
		
		System.out.println();
		rd.removeDuplicates();
		
		System.out.print("After Linked List: ");
		rd.DisplayLL();
	}

}
