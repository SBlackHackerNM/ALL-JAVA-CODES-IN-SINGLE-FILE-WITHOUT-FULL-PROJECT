import java.util.Stack;   
class Main
{ 
    // A utility function to return precedence of a given operator 
    // Higher returned value means higher precedence 
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    }   
    static String infixToPostfix(String s) 
    { 
        String ans = new String(""); 
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<s.length(); ++i) 
        { 
            char c = s.charAt(i);  
            if (Character.isLetterOrDigit(c)) 
                ans += c; 
            else if (c == '(') 
                stack.push(c); 
            else if (c == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    ans += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid";              
                else
                    stack.pop(); 
            } 
            else 
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid"; 
                    ans += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid"; 
            ans += stack.pop(); 
         } 
        return ans; 
    }
    public static void main(String[] args)  
    { 
        String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(infixToPostfix(exp)); 
    } 
}