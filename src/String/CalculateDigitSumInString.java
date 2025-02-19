package String;
import java.util.*;
public class CalculateDigitSumInString {
    public static void main(String[] args) {
    	   String str = "1234stifna253";
    	   int sum = 0;
    	   for(int i=0;i<str.length();i++) {
    		   if(str.charAt(i)>=48 && str.charAt(i)<=57) {
    			   sum = sum+str.charAt(i)-48;
    		   }
    	   }
    	   
    	   System.out.println("Sum is: "+sum);
    }
}
