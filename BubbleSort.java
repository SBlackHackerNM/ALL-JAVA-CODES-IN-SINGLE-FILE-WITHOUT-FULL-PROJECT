import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),a[]=new int[n];
        for (int i = 0; i < n; i++)  a[i]=scan.nextInt();
        scan.close();
        int c,d;
        System.out.println("Bubble sort gives:");
        for(c=0;c<n-1;c++) for(d=0;d<n-c-1;d++) if(a[d]>a[d+1])
        {
        a[d]=a[d]+a[d+1];
        a[d+1]=a[d]-a[d+1];
        a[d]=a[d]-a[d+1];
        }
        for (int i = 0; i < a.length; i++) System.out.print(a[i]);
        
    }
}
