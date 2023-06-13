
package LinkedList;

import java.util.Scanner;

import LinkedList.InsertionAll.Node;

public class CalculationLL {

   Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d) {
			data=d;
			next=null;
		}
	}

//	Implementation of insertion of at the End
	  void atEnd(int atEnd) {
		
		Node newNode = new Node(atEnd);
		Node temp = head;
//		LinkedList id empty 
		if(head == null) {
            head = newNode;
            return;
        }
		
//		LinkedList is not empty
        newNode.next = null;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return;
	}

//	Implementation of insertion of at the begin
	void atBegin(int atBegin) {
		Node newNode = new Node(atBegin);
//		LinkedList is empty
		if(head==null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		return;
	}
	 
//	Implementation of insertion of at the Anything
    void atAny(int position, int newData) {
    	Node newNode = new Node(newData);
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
	
//	Implementation of insertion of at the Delete
	void atDeletion(int position) {
//		 linkedlist is empty
        if(head == null){
            return;
        }

        Node temp = head;
        // deletion from the beginning
        if(position == 0){
            head = temp.next;
            return;
        }

        // deletion is from other positions apart from the beginning
        for(int i=0; temp != null && i<position-1; i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return;
        }

        temp.next = temp.next.next;
	}
	
//	 implementation of displaying the linkedlist
    public void displayLL(){
    	Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
	
//	Implementation of main method
	public static void main(String args[]) {
		
		CalculationLL cLL=new CalculationLL();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("****************************");
			System.out.println("1) atEnd");
			System.out.println("2) atBegin");
			System.out.println("3) atSepecificNode");
			System.out.println("4) delte of Node");
			System.out.println("5) Display of LL");
			System.out.println("0) Exist of program");
			System.out.println("****************************");
			
			while(true) {
				System.out.print("Enter the letter: ");
				String choice = sc.next();
				if(choice.equals("1")) {
					System.out.print("Enter at the end: ");
					int atEnd = sc.nextInt();
					cLL.atEnd(atEnd);
				}
				else if (choice.equals("2")) {
					System.out.print("Enter at the begin: ");
					int atBegin = sc.nextInt();
					cLL.atBegin(atBegin);
				}
				else if (choice.equals("3")) {
					System.out.println("Insert any particular node: ");
					
					System.out.print("Enter the position: ");
					int pos = sc.nextInt();
					
					System.out.print("Enter the Value: ");
					int val = sc.nextInt();
					
					cLL.atAny(pos,val);
				}
				else if (choice.equals("4")) {
					System.out.println("deletion of the node: ");
					int atdelet = sc.nextInt();
					cLL.atDeletion(atdelet);
					
				}
				else if (choice.equals("5")) {
					
					cLL.displayLL();
					System.out.println();
				}
				else if(choice.equals("0")) {
					 System.out.println("*************************************");
					     System.out.println("Thank you using for service");
					 System.out.println("*************************************");
					 break;
				}
				else {
					System.out.println("your Input are wrong ! then ReInput");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Plz Iput integer: "+e.getMessage());
		}
		
	}
	
}
