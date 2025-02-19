package ArrayPrograms;
import java.util.*;
public class ShowDigitSum {
     public static void main(String[] arsg) {
    	   int a[]  = {5732, 8659, 2534,9625,7354};
    	   
    	   for(int i=0;i<a.length;i++) {
               int sum = 0;   		   
     		   while(a[i]!=0) {
    			   int rem = a[i]%10;
    			   sum =sum+rem;
    			   a[i]  = a[i]/10;
    		   }
     		   System.out.print(sum+" ");
    	   }
    	   
    	  
     }
}
