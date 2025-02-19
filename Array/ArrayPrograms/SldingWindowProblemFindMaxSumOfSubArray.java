package ArrayPrograms;

public class SldingWindowProblemFindMaxSumOfSubArray {
   static int FindMaxSum(int[] arr,int k) {
	   int maxsum=0,currsum=0;
	    for(int i=0;i<arr.length;i++) {
	    	maxsum  = 0; currsum=0;
	    	for(int j=i+1;j<k+i;j++) {
	    		 currsum = arr[i+j];
	    		 maxsum=Math.max(maxsum, currsum);
	    	}
	    }
	    return maxsum;
   }
   
   public static void main(String[] args) {
	   int[] arr = {10,20,30,40,50};
	   int k = 3;
	   int result = FindMaxSum(arr,k);
	   System.out.println("Maximum Sum of Subarray: "+result);
   }
}
