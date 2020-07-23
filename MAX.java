import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        
        scanner.close();
        int k;
        for (int j = 0; j < d; j++)
        for (int i = 0; i < n-1; i++) {
            k=a[i];
            a[i]=a[i+1];
            a[i+1]=k;
        }
        for (int i = 0; i < n; i++) System.out.print(a[i]+" ");
    }
}



Maximum Element 


import java.util.*;

public class Main {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),a[]=new int[n];
        for (int i = 0; i < n; i++)  a[i]=scan.nextInt();
        scan.close();
        int c,d,e=a[0];
        for(c=0;c<n-1;c++) for(d=c+1;d<n;d++) if(a[d]>e) e=a[d];
        System.out.print(e);
        
    }
}
