package ExceptionHandling;
import java.util.*;
class VoterAgeException extends Exception{
	public String getVoterError() {
		return "Invalid Voter";
	}
}

class CheckVoter{
	void ValidateVoter(int age)throws VoterAgeException{
		if(age<18) {
       	 VoterAgeException ex = new VoterAgeException();
       	 throw ex;
        }
		else
		{
			System.out.println("You are valid voter");
		}
	}
}
public class UserDefinedException {
   public static void main(String[] x) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("\nEnter age: ");
	     int age = sc.nextInt();
         CheckVoter cv = new CheckVoter();
         try {
        	 cv.ValidateVoter(age);
         }
         catch(VoterAgeException ex) {
        	 System.out.println("Error is: "+ex.getVoterError());
         }
         
   }
}
