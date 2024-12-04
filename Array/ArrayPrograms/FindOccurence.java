package ArrayPrograms;

public class FindOccurence {
   public static void main(String[] args) {
	   int a[] = {1,2,1,3,4,5};
	   for(int i=0;i<a.length;i++)
	   {
		      int count = 0;
		      for(int j=i+1;j<a.length;j++) {
			  if(a[i] == a[j])
			  {
				  ++count; 
			  }
			  System.out.println(a[i]+count);
		   }
	   }
   }
}
