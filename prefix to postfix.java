import java.util.*;   
class Main
{ 
static boolean isOperator(char x)  
{ 
switch (x)  
{ 
        case '+': 
        case '-': 
        case '/': 
        case '*': 
return true; 
}
return false; 
}  
static String preToPost(String p) 
{ 
    Stack<String> s= new Stack<String>(); 
    int length = p.length();  
    for (int i = length - 1; i >= 0; i--)  
    {  
    if (isOperator(p.charAt(i)))  
        { 
            String a = s.peek(); s.pop(); 
            String b = s.peek(); s.pop();
            String ans = a + b + p.charAt(i);
            s.push(ans); 
        } 
        else
        { 
        s.push( p.charAt(i)+""); 
        } 
    }  
    return s.peek(); 
} 
public static void main(String args[])  
{ 
    String p = "*-A/BC-/AKL"; 
    System.out.println(preToPost(p)); 
} 
}