Without Bubble Sort 
import java.util.*;

public class Main {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),a[]=new int[n];
        for (int i = 0; i < n; i++)  a[i]=scan.nextInt();
        
        Arrays.sort(a);
        System.out.println("Sorting gives:");
        for(int i = 0; i < a.length; i++) System.out.print(a[i]);
        
    }
}





Hacker Rank Code 

import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
int a[]=new int[n];
for(int b=0;b<n;b++) a[b]=scan.nextInt();
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


Hacker Rank Code 2
  
  
