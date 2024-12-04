package ObjectClass;
class Test{
	int no;
	Test(int no){
		this.no = no;
	}
}
public class ObjectClass {
   public static void main(String[] args) {
	   Test t1 = new Test(10);
       Test t2 = new Test(10);
       boolean b = t1.equals(t2);
       System.out.println(b);
       System.out.println("Hashcode of t1: "+System.identityHashCode(t1));
       System.out.println("Hashcode of t2: "+System.identityHashCode(t2));
       if(t1.equals(t2)==true) {
    	   System.out.println("Objects are same");
       }
       else {
    	   System.out.println("Object are not same");
       }
   }
}
