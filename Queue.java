class Q { 
    int front, rear, size; 
    int capacity; 
    int array[]; 
  
    Q(int capacity) 
    { 
        this.capacity = capacity; 
        front = this.size = 0; 
        rear = capacity - 1; 
        array = new int[this.capacity]; 
    }  
   boolean isEmpty(Q q) 
    { 
        return (q.size == 0); 
    }  
    boolean isFull(Q q) 
    { 
        return (q.size == q.capacity); 
    }  
    void enqueue(int item) 
    { 
        if (isFull(this)) 
            return; 
        this.rear = (this.rear + 1) 
                    % this.capacity; 
        this.array[this.rear] = item; 
        this.size = this.size + 1; 
        System.out.println(item); 
    }  
    int dequeue() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        int item = this.array[this.front]; 
        this.front = (this.front + 1) 
                     % this.capacity; 
        this.size = this.size - 1; 
        return item; 
    } 
    int front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        return this.array[this.front]; 
    } 
    int rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
  
        return this.array[this.rear]; 
    } 
} 
public class Main { 
    public static void main(String[] args) 
    { 
        Q queue = new Q(100); 
  
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40);
        System.out.println( "Remove Element" + queue.dequeue()); 
        System.out.println("Front Element" + queue.front()); 
        System.out.println("Rear Element" + queue.rear()); 
    } 
}