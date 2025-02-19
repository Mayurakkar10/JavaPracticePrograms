package JaggedArray;
import java.util.*;
public class JaggedArray {
   public static void main(String[] args) {
	     int a[][] = new int[3][];
	     Scanner sc =new Scanner(System.in);
	     a[0] = new int[3];
	     a[1] = new int[4];
	     a[2] = new int[2];
	     
	     System.out.println("\nEnter numbers: ");
	     for(int i=0;i<a.length;i++) {
	    	for(int j = 0;j<a[i].length;j++) {
	    		a[i][j] = sc.nextInt();
	    	}
	     }
	     
	     for(int i=0;i<a.length;i++) {
		    	for(int j = 0;j<a[i].length;j++) {
		    		System.out.print(a[i][j]+ " ");
		    	}
		    	System.out.println("\n");
         }
	     
	     
   }
}
