package LinkedList;
public class InsertAtEnd {
    Node head=null,temp;

    class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // LinkedList is not empty
        newNode.next = null;
     // traversing the linkedlist at the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }
    
//  implementation of insertion of Node at the Begining
    public void insertAtBegin(int newData) {
    	 Node newNode = new Node(newData);
    	 newNode.next = head;
    	 head = newNode;
    }
    
//  implementation of insertion of Node at the Any
    public void insertAtAfter(Node prevNode, int newData) {
  	    if(prevNode==null) {
  	    	System.out.println("The previous Node can't contains null values ");
  	    	return;
  	    }
  	    Node newNode = new Node(newData);
  	    newNode.next = prevNode.next;
  	    prevNode.next = newNode;
    }

    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }

    public static void main(String[] args) {
        InsertAtEnd llist = new InsertAtEnd();

        // function calling
        llist.insertAtBegin(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtAfter(llist.head.next.next,13);
        llist.insertAtEnd(10);
        llist.insertAtBegin(15);

        System.out.println("Linked List after successful insertion of all the nodes:");
        llist.printNodes();
        System.out.println();


    }
}