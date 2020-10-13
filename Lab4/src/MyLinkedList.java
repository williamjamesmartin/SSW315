public class MyLinkedList { //Start of class MyLinkedList 
	private Node first;
	private Node last;
	//LinkList constructor 
	public MyLinkedList() 
	{ 
		first = null; 
		
	}
	
	//Returns true if the linked list is empty 
	public boolean isEmpty() 
	{ 
		return first == null; 
		
	}
	
	//updates to store the last node
	public void updateLast() {
		Node currentNode = first; 
		while(currentNode!= null) 
		{ 
			if (currentNode.next == null) {
				last = currentNode;
				last.next = null;
			}
			currentNode = currentNode.next;
		} 
	}
	//reverses the linked list
	public void reverse() {
		Node prev = null;
		Node curr = first;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		first = prev;
	}
	//deleted the last item in the linked list
	public Node deleteLast() {
		updateLast();
		Node temp = last;
		Node currentNode = first; 
		while (currentNode.next != last) {
			currentNode = currentNode.next;
		}
		last = currentNode;
		last.next = currentNode;
		currentNode.next = null;
		return temp;
	}
	// gets the size of the linked list
	public int size() {
		int returnSize = 0;
		Node currentNode = first; 
		while(currentNode!= null) 
		{ 
			returnSize++;
			currentNode = currentNode.next;
		} 
		System.out.println("The linked list currently has " + returnSize + " nodes.");
		return returnSize;
	}
	
	//Add node to the end of the linked list
	public void addLast(int d1, double d2) {
		Node node = new Node(d1, d2); 
		updateLast();
		last.next = node;
	}

	//Inserts a new node at the first of the linked list
	public void addFirst(int d1, double d2) 
	{ 
		Node node = new Node(d1, d2); 
		node.next = first; 
		first = node; 
		updateLast();
	}
	
	//Deletes the node at the first of the linked list
	public Node deleteFirst() 
	{ 
		Node temp = first; 
		first = first.next; 
		updateLast();
		return temp;
	}
	
	//Prints the linked list data
	public void printList() 
	{ 
		Node currentNode = first; 
		System.out.print("List: "); 
		while(currentNode!= null) 
		{ 
			currentNode. printNode(); 
			currentNode = currentNode.next; 
		} 
		System.out.println(""); 
		
	} 	
} //End of class LinkList