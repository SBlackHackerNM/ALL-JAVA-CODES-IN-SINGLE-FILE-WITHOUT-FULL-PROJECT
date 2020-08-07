class Main { 
    static class Node { 
		int data; 
		Node next; 
	}; 
	static Node push(Node head, int data) 
	{ 
		Node ptr1 = new Node(); 
		ptr1.data = data; 
		ptr1.next = head; 
        
        if(head != null) { 
			Node temp = head; 
			while (temp.next != head) 
				temp = temp.next; 
			temp.next = ptr1; 
		} 
		else ptr1.next = ptr1;

		head = ptr1; 
		return head; 
	} 

	static void printList(Node head) 
	{ 
		Node temp = head; 
		if (head != null) { 
			do { 
				System.out.printf("%d ", temp.data); 
				temp = temp.next; 
			} while (temp != head); 
		} 
        System.out.println(); 
	} 

	static Node deleteNode(Node head, int key) 
	{ 
		if (head == null) return null; 
        Node curr = head, prev = new Node(); 
		while (curr.data != key) { 
			if (curr.next == head) { 
				System.out.println("\nNot found"); 
				break; 
			} 
        	prev = curr; 
			curr = curr.next; 
		} 
		if (curr.next == head) { 
			head = null; 
			return head; 
		} 
		if (curr == head) { 
			prev = head; 
			while (prev.next != head) 
				prev = prev.next; 
			head = curr.next; 
			prev.next = head; 
		} 
		else if (curr.next == head) prev.next = head;
		else prev.next = curr.next; 
		return head; 
	} 
	
	public static void main(String args[]) 
	{ 
		Node head = null;
		head = push(head, 2); 
		head = push(head, 5);
        head = deleteNode(head, 5); 
		printList(head); 
	} 
}