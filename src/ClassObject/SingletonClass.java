package ClassObject;

class Test{
	 private static Test t = null;
	 private Test(){
		System.out.println("\nI am singleton class"); 
	 }
	 static Test getInstance() {
		if(t==null) {
			t = new Test();
		}
		return t;
	 }
	 
}


public class SingletonClass {
     public static void main(String[] args){
    	 Test t = Test.getInstance();
    	 Test t1 = Test.getInstance();
    	 System.out.println(t.hashCode());
    	 System.out.println(t1.hashCode());
    	 
     }
}
