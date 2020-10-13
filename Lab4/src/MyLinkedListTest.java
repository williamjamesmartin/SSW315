public class MyLinkedListTest { //Start of class MyLinkedListTest
	public static void main(String[] args) 
	{ 
		MyLinkedList list = new MyLinkedList(); 
		list.addFirst(1, 1.01); 
		list.printList(); 
		list.addFirst(2, 2.02); 
		list.printList(); 
		list.addFirst(3, 3.03); 
		list.printList(); 
		list.addFirst(4, 4.04); 
		list.printList(); 
		list.addFirst(5, 5.05); 
		list.printList(); 
		list.addLast(6, 6.06);
		list.printList(); 
		list.size();
		list.deleteLast();
		list.printList();
		list.size();
		list.reverse();
		list.printList();
		
		while(!list.isEmpty()) 
		{ 
			Node deletedLink = list.deleteFirst(); 
			System.out.print("deleted: "); 
			deletedLink.printNode(); 
			System.out.println(""); 
		} 
		list.printList(); 	
	}
} //End of class MyLinkedListTest
