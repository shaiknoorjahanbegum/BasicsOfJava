package com.basicsOOPs;

class MyWrap
{
	private int i;
	public MyWrap(int i)
	{
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return "MyWrap [i=" + i + "]";
	}
	
}
public class WrapperClasses {
public static void main(String[] args) {
	//auto boxing : converting primitive to non primitive datat type 
	int a=34;
	Integer o= new Integer(a);
	System.out.println(a);
	System.out.println(o);
	
	//auto unboxing converting non primitive type to primitive type 
	Integer i= new Integer(342);
	int h=i;
	System.out.println(i);
	System.out.println(h);
	
	//boxing
	int j=34;
	Integer s=Integer.valueOf(j);//boxing
	Integer s1=s;//unboxing
	System.out.println(s);
	
	
	int k=32;
	MyWrap wrap= new MyWrap(k);
	System.out.println(wrap);
}
}
