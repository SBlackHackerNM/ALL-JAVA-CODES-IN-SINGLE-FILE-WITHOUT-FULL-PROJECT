import java.util.Scanner;
// Other imports go here
// Do NOT change the class name

class Main
{
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }
public static Main fun(Main list,int data)
{
    Node n = new Node(data);
    if(list.head==null)
    {
        list.head = n;
    }
    else
    {
        Node head_new = list.head;
        while(head_new.next!=null)
        {
            head_new = head_new.next;
        }
        head_new.next = n;
    }
    return list;
}
public static void fun1(Main list)
{
    Node na = list.head;
    while(na!=null)
    {
        System.out.print(na.data+" ");
        na = na.next;
    }
}
public static Main fun2(Main l,int p,int data)
{
    int i = 1;
    Node c = l.head;
    Node b = new Node(data);
    while(i<p-1)
    {
        c = c.next;
        i++;
    }
    b.next = c.next;
    c.next = b;
    return l;
}
public static void main(String[] args)
{

    // Write your code here
    Main obj = new Main();
    obj = fun(obj,1);
    obj = fun(obj,2);
    obj = fun(obj,3);
    obj = fun(obj,4);
    obj = fun(obj,5);
    fun1(obj);
    fun2(obj,3,5);
    System.out.println();
    fun1(obj);
}

}