package ClassObject;

class VariableArgs{
	int sum = 0;
	int setArray(int ...x) {
		for(int i=0;i<x.length;i++) {
			sum = sum+x[i];
		}
		return sum;
	}
	
}

public class VariableArgument {
    public static void main(String[] args) {
    	  
    	VariableArgs  va = new VariableArgs();
        int sum = va.setArray(10,20,30,40,50);
        System.out.println("Sum is: "+sum);
    }
}
