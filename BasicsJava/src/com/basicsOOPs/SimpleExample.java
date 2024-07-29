package com.basicsOOPs;

abstract class H
{
	int i;
	static int j;
	final int k;
	static final int l;
	{
		k=34;
	}
	static {
		l=342;
	}
	public H()
	{
		System.out.println(" i am the constructor ");
	}
	private void privateMethod()
	{
		System.out.println("i am private method of abstract class ");
	}
	public void access()
	{
		privateMethod();
	}
	public static void staticMethod()
	{
		System.out.println("i am the static method of abstract class ...");
	}
	public abstract void m1() ;
}

class X extends H
{

	@Override
	public void m1() {
		System.out.println("m1 method defined for second class ");
		
	}
	
}

abstract class V
{
	int i=405;
	abstract void m1();
}
class U extends V
{

	@Override
	void m1() {
		System.out.println("m1() defined for class U");
	}
	
}
public class SimpleExample {
	public static void main(String[] args) {
		H h = new X();
		System.out.println(h.i);
		System.out.println(h.j);
		System.out.println(h.k);
		System.out.println(h.l);
		h.access();
		h.staticMethod();
		
		V v = new U();
		System.out.println(v.i);
		v.m1();
	}

}
