class QueueNode { 
int k; 
QueueNode next; 
QueueNode(int k) 
{ 
this.k = k; 
this.next = null; 
} 
}  
class Queue { 
QueueNode front, rear; 
 Queue() 
{ 
this.front = this.rear = null; 
}  
void enqueue(int data) 
{ 
QueueNode temp = new QueueNode(data);
if (this.rear == null) { 
this.front = this.rear = temp; 
return; 
} 
this.rear.next = temp; 
this.rear = temp; 
} 
void dequeue() 
{ 
if (this.front == null) 
return; 
QueueNode temp = this.front; 
this.front = this.front.next; 
if (this.front == null) 
this.rear = null; 
} 
}  
public class Main { 
public static void main(String[] args) { 
        Queue q = new Queue(); 
        q.enqueue(10); 
        q.enqueue(20); 
        q.dequeue(); 
        q.dequeue(); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
        q.dequeue(); 
        System.out.println("Front : " + q.front.k); 
        System.out.println("Rear : " + q.rear.k); 
    } 
}