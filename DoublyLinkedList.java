class DoublyLinkedList {    
class Node{  
        int data;  
        Node previous;  
        Node next;     
public Node(int data) {  
this.data = data;  
    }  
    }  
Node head, tail = null;  
public void insert(int data) {    
Node newNode = new Node(data);    
if(head == null) {  
head = tail = newNode;  
head.previous = null;    
tail.next = null;  
}  
else {    
tail.next = newNode;  
newNode.previous = tail;  
tail = newNode;
tail.next = null;  
}  
}     
public void print() {            
Node current = head;  
if(head == null) {  
System.out.println("EMPTY");  
return;  
}   
while(current != null) {                
System.out.print(current.data + " ");  
current = current.next;  }  
}  
}
class Main{    
public static void main(String[] args) {  
DoublyLinkedList l = new DoublyLinkedList();   
l.insert(1);  
l.insert(2);  
l.insert(3);  
l.insert(4);  
l.insert(5);    
l.print(); 
System.out.println();
l.insert(6); 
l.print();
}  
}