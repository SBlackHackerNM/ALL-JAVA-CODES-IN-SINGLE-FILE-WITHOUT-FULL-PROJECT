class LinkedList

{ 
	Node head;
	
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 

    public void append(int new_data) 
	{ 
		Node new_node = new Node(new_data); 

		if (head == null) 
		{ 
			head = new Node(new_data); 
			return; 
		} 

		new_node.next = null; 

		Node last = head; 
		while (last.next != null) 
			last = last.next; 
			
		last.next = new_node; 
		return; 
	} 
	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		} 
	} 
	public static void main(String[] args) 
	{ 
		Main linkedlist = new Main(); 

		linkedlist.append(1); 

		linkedlist.append(2); 

		System.out.println("\nCreated Linked list is: "); 
		linkedlist.printList(); 
	} 
} 
