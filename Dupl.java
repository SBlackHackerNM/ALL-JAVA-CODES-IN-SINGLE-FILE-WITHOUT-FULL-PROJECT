import java.util.*;
import java.io.*;
class Dupl {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();int  c[] = new int[b];
        for (int i = 0; i < b; i++) c[i] = a.nextInt();
        HashSet hash = new HashSet();
	    for(int i = 0 ; i < b; i++)
	    {
	        if(hash.contains(c[i])||c[i]<=0) System.out.print(c[i] + " ");
	        else hash.add(c[i]);
	    }
    }
}