package com.ObjectCloning;

class Cube{
	 private int no;
	 public void setNo(int no) {
		 this.no = no;
	 }
	 public void showCube() {
		 System.out.println(no*no*no);
	 }
}
public class ObjectDataLossProblem {
    public static void main(String[] args) {
    	Cube  c1 = new Cube();
    	c1.setNo(10);
    	System.out.println("Value at c1 is:");
    	c1.showCube();
    	Cube c2 = c1;
    	System.out.println("Value at c2 is: ");
    	c2.setNo(5);
    	c2.showCube();
    	
    	//here we loss the 1000 value which is assinged before so we loss data so for that reason we need to use 
    	//object cloning
    	System.out.println("Value at c1 is: ");
    	c1.showCube();
    }
}
