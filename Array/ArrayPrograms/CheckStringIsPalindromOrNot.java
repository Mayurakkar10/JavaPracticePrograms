package ArrayPrograms;
import java.util.*;
public class CheckStringIsPalindromOrNot {
   public static boolean isPalidrome(String str) {
	  int start = 0;
	  int end = str.length()-1;
	  while(start<end) {
		 if(str.charAt(start)!=str.charAt(end)){
		     return true;
		 }
		 start++;
		 end--;
	  }
	  return false;
   }
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a string");
	   String str = sc.nextLine();
	   boolean check = isPalidrome(str);
	   if(check) {
		   System.out.println("Not a palidrome String");
	   }
	   else {
		   System.out.println("Palindrome String");
	   }
   }
}
