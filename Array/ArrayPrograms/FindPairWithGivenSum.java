package ArrayPrograms;

public class FindPairWithGivenSum {
     public static void main(String[] args) {
    	 int[] nums = {3,8,12,4,7,6,2,5,11,9,10};
    	 int target = 13;
    	 
    	 int smallestProduct = Integer.MAX_VALUE;
    	 for(int i=0;i<nums.length;i++) {
    		 for(int j=i+1;j<nums.length;j++) {
                   if(nums[i]+nums[j] == target) {
                	   int product = nums[i]*nums[j];
                	   if(smallestProduct>product) {
                		   smallestProduct = product;
                	   }
                   }
    		 }
    	 }
    	 System.out.println(smallestProduct);
     }
}
