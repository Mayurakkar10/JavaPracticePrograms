package String;

public class SearchValue {
      SearchValue(char ch[],char svalue){
    	  for(int i=0;i<ch.length;i++) {
    		   if(svalue==ch[i]){
    			   System.out.println(ch[i-1]+" "+ch[i+1]);
    		   }
    		 
    	  }
      }
}
