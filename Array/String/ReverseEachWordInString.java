package String;
import java.util.*;
public class ReverseEachWordInString {
   public static void  reverseEachWordInStringUsingStringBuilder(String str) {
	    String[] words = str.split(" ");
	    StringBuilder sb = new StringBuilder();
	    for(String word:words) {
	    	sb.append(word);
	    }
	    System.out.println(sb);
   }
   public static String reverseEachWordInString(String str) {
	      String[] words  = str.split(" ");
	      String revString ="";
	      for(int i=0;i<words.length;i++) {
	    	  String revword = "";
	    	  for(int j=words[i].length()-1;j>=0;j--) {
	    		  char ch = words[i].charAt(j);
	    		  if(words[i].charAt(j)=='a'||words[i].charAt(j)=='e'||words[i].charAt(j)=='i'||words[i].charAt(j)=='o'||words[i].charAt(j)=='u')
	    		  {
	    			 ch = Character.toUpperCase(ch);
	    		  }
	    		  revword= revword+ch;
	    	  }
	    	  revString = revString+revword+" ";
	      }
	      return revString;
   }
	
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter string: ");
	  String str = sc.nextLine();
	  reverseEachWordInStringUsingStringBuilder(str);
//	  String result = reverseEachWordInString(str);
	  System.out.println(result);
   }
}
