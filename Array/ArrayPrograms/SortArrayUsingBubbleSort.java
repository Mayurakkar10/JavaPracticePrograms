package ArrayPrograms;

public class SortArrayUsingBubbleSort {
    public static void main(String[] args) {
         int a[] = {8,2,10,4,1};
         for(int i=0;i<a.length;i++) {
        	 for(int j=0;j<a.length-1-i;j++) {
        		 if(a[j]>a[j+1]) {
        			 int temp = a[j];
        			 a[j] = a[j+1];
        			 a[j+1] = temp;
        		 }
        	 }
         }
         for(int arr:a) {
        	 System.out.print(arr+" ");
         }
    }
}
