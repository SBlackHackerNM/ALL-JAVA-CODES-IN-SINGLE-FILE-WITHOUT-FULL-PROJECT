import java.util.*;

class Stack
{
	int arr[];
	int top;
	int capacity;
	Stack(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OVERFLOW");
			System.exit(1);
		}

		System.out.println(x);
		arr[++top] = x;
	}
	public int pop()
	{
		if (isEmpty())
		{
			System.out.println("UNDERFLOW");
		}

		System.out.println(peek());
		return arr[top--];
	}
	public int peek()
	{
		if (!isEmpty())
			return arr[top];
		else
			System.exit(1);

		return -1;
	}
	public int size()
	{
		return top + 1;
	}
	public Boolean isEmpty()
	{
		return top == -1;	
	}
	public Boolean isFull()
	{
		return top == capacity - 1;	
	}
}
class Main
{
	public static void main (String[] args)
	{
		Stack stack = new Stack(3);
		stack.push(1);		
		stack.push(2);		
		stack.pop();		
		stack.pop();		
		stack.push(3);		
		System.out.println( stack.peek());
		System.out.println(stack.size());
		stack.pop();	
	}
}