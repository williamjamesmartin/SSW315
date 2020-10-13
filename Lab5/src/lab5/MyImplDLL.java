package lab5;

public class MyImplDLL <E> implements MyDoubleLinkedList {

	private MyDoubleNode head;
	private MyDoubleNode tail;
	private int size;
	
	public MyImplDLL() {
		head = new MyDoubleNode(null, null, null);
		tail = new MyDoubleNode(null, null, head);
		head.next = tail;
		size = 0;
	}
	
	@Override
	public void insert(Object x) {
		// TODO Auto-generated method stub
		MyDoubleNode newNode = new MyDoubleNode(x, tail, tail.prev);
		tail.prev.next = newNode;
		tail.prev = newNode;
		size++;
	}
	
	public int getSize() {
		return size;
	}

	@Override
	public void delete(Object x) {
		// TODO Auto-generated method stub
		MyDoubleNode currNode = head.next;
		while (currNode != tail) {
			if (currNode.data.equals(x)) {
				currNode.prev.next = currNode.next;
				currNode.next.prev = currNode.prev;
				size--;
				break;
			}
			else {
				currNode = currNode.next;
			}
		}
	}
	
	public void insert(Object x, MyDoubleNode a) {
		MyDoubleNode currNode = head.next;
		while (currNode != tail) {
			if (currNode.data.equals(a)) {
				MyDoubleNode newNode = new MyDoubleNode(x, currNode, currNode.next);
				currNode.next = newNode;
				currNode.next.next.prev = newNode;
				size++;
			}
			else {
				currNode = currNode.next;
			}
		}
	}

	@Override
	public boolean lookup(Object x) {
		// TODO Auto-generated method stub
		MyDoubleNode currNode = head.next;
		while (currNode != null) {
			if (currNode.data.equals(x)) {
				return true;
			}
			currNode = currNode.next;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head.next == tail) {
			return true;
		}
		else return false;
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		MyDoubleNode currNode = head.next;
		while (currNode.next != null || currNode != tail) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}

	@Override
	public void printListRev() {
		// TODO Auto-generated method stub
		MyDoubleNode currNode = tail.prev;
		while (currNode.prev != null || currNode != head) {
			System.out.println(currNode.data);
			currNode = currNode.prev;
		}
	}
	public static void main(String a[]){
		  MyImplDLL<Integer> dll = new MyImplDLL<Integer>();
		  dll.insert(10);
		  dll.insert(34);
		  dll.insert(56);
		  dll.insert(364);
		  dll.printList();
		  dll.delete(56);
		  dll.delete(34);
		  dll.printListRev();
		} 
}


