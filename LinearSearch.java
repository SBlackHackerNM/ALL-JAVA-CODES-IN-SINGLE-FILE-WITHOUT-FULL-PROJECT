
import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch
          {
	public static void main(String[] args) 
	      {
Scanner  a  =  new  Scanner(System.in);
int      b  =  a.nextInt();                      //  Array  Size  Declaration  Variable           //
int    c[]  =  new  int[b];                     //  Array  Declaration                           //
int      d  =  0;                              //   Loop  Variable                              //
while(d<b){                                   //    Array  Element  Initilization  Loop        //
       c[d] =  a.nextInt();
       d++;
            }
int      e  =  a.nextInt();               //       Searching  Element                             //
                                         //        Linear  Search  Implementation                //
int      f  =  0;                       //         Linear  Search  Loop  Variable               //
int      g  =  0;                      //          Flag  Variable                              //
int      h  =  0;                     //           Searched   Variable  Index                 //
while(f<b)                           //            Searching  Loop                           //
         {
if(c[f]==e)
          {
         g  =  1;
         h  =  f;
         break;
            }
       f++;
            }
if(g==1)  {
System.out.println("Element  Found  At  Index"  +"  "+h);            
            }
else 
          {
System.out.println("Element  Not  Found");          
            }
       f++;           
	        }
	        }
            

