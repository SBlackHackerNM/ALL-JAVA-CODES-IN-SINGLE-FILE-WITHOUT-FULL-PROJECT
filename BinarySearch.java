
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch
          {
	public static void main(String[] args) 
	      {
Scanner a=new  Scanner(System.in);
int      b  =  a.nextInt();                      //  Array  Size  Declaration  Variable           //
int    c[]  =  new  int[b];                     //  Array  Declaration                           //
int      d  =  0;                              //   Loop  Variable                              //
while(d<b){                                   //    Array  Element  Initilization  Loop        //
       c[d] =  a.nextInt();
       d++;
            }
int      e  =  a.nextInt();               //       Searching  Element                      //
                                         //        Binary  Search  Implementation         //
Arrays.sort(c);                         //         Binary  Search  Condition             //
int      f  =  0;                      //          Left  Variable  Index                //
int      g  =  b-1;                   //           Right  Variable  Index              //
int      h;                          //            Middle  Variable  Index            //
while(f<=g)                         //             Searching  Loop                   //
         {
         h  =  (f+g)/2;
if(c[h]==e)
          {
System.out.println("Element  Found  At  Index"+ "  "+h); 
break;
            }
else if(c[h]>e)
          {
         g  =  h-1;           
            }
else if(c[h]<e)
          {
         f  =  h+1;           
            }
            }
if(f>g)
          {
System.out.println("Element  Not  Found");                   
            }
	        }
            }


