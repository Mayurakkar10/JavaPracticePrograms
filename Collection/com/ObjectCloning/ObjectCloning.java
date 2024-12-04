package com.ObjectCloning;
class Cube1 implements Cloneable{
	private int no;
	public void setNo(int no) {
		this.no =no;
	}
	public void showCube() {
		System.out.println(no*no*no);
	}
	public Cube1 getClone()throws CloneNotSupportedException{
		Object obj = this.clone();
		Cube1 c = (Cube1)obj;
		return c;
	}
}
public class ObjectCloning {
    public static void main(String[] args)throws Exception{
    	Cube1 c1 = new Cube1();
    	c1.setNo(10);
    	System.out.println("value at c1: ");
    	c1.showCube();
    	Cube1 c2  = c1.getClone();
    	c2.setNo(5);
    	System.out.println("value at c2: ");
    	c2.showCube();
    	System.out.println("value at c1: ");
    	c1.showCube();
    	
    }
}

