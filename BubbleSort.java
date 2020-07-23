import java.util.*;

public class BubbleSort {

public static void main(String[] args) {
	   
Scanner a = new Scanner(System.in);
int b = a.nextInt(),c[]=new int[b];
for (int d = 0; d < b; d++)  c[d]=a.nextInt();
a.close();
int e,f;
System.out.println("Bubble sort gives:");
for(e=0;e<b-1;e++) for(f=0;f<b-e-1;f++) if(c[f]>c[f+1])
{
c[f]=c[f]+c[f+1];
c[f+1]=c[f]-c[f+1];
c[f]=c[f]-c[f+1];
}
for (int g = 0; g < c.length; g++) System.out.print(c[g]);
}
}
