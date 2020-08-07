import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        LinkedList c = new LinkedList();
        c.fun0(1);
        c.fun0(2);
        c.fun0(3);
        c.fun0(4);
        c.fun0(5);
        c.fun1();
        c.fun0(6);
        System.out.println("LinkedList After Insertion At The End");
        c.fun1();
    }
    }
class Node
{
    int a;
    Node b;
    Node(int a)
    {
        this.a = a;
        this.b = b;
    }
}
class LinkedList
{
    Node e;
    public void fun0(int d)
    {
        Node f = new Node(d);
        if(e==null)
        {
            e = f;
        }
        else
        {
            Node g = e;
            while(g.b!=null)
            {
                g = g.b;
            }
            g.b = f;
        }
    }
    public void fun1()
    {
        Node h = e;
        System.out.print("LinkedList"+" : ");
        while(h!=null)
        {
            System.out.print(h.a+" ");
            h = h.b;
        }
        System.out.println();
    }
}