package ArrayPrograms;

import java.util.Arrays;

public class UnionOfTwoArray {
   public static void main(String[] args) {
	     int[] arr1 = {10,20,30,40,50};
	     int[] arr2 = {40,50,60,70,70};
	     
	     int[] arr3 = new int[arr1.length+arr2.length];
	     
	     for(int i=0;i<arr1.length;i++) {
	    	 arr3[i]  = arr1[i];
	     }
	     
	     int k = arr1.length;
	     for(int j=0;j<arr2.length;j++) {
	    	 arr3[k++] = arr2[j];
	     }
	     Arrays.sort(arr3);
         System.out.print(arr3[0]+" ");
	     for(int l = 1;l<arr3.length;l++) {
	    	 if(arr3[l]!=arr3[l-1]) {
	    		 System.out.print(arr3[l]+" ");
	    	 }
	     }
   }
}
