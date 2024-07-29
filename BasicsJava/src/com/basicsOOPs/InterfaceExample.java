package com.basicsOOPs;

import java.util.Objects;

interface Iter
{
	int i=10;
	void m1();
	void m2();
}
class D1 implements Iter
{

	@Override
	public void m1() {
		System.out.println("m1() method");
	}

	@Override
	public void m2() {
	System.out.println("m2() method ");
	}
}

//marker interface
class WasherMan 
{
	public void wash(Object obj)
	{
		if(obj instanceof Object)
		{
			System.out.println(obj.getClass().getSimpleName()+" is washed .");	
			System.out.println("water pushed with force can wash the "+obj.getClass().getSimpleName());
		}
		else
		{
			System.out.println(obj.getClass().getSimpleName()+" not washable type ");
		}
	}
}
interface Washable
{
	
}
class Car2 implements Washable
{
	
}
class Simple
{
	int i;
	public Simple(int i)
	{
		this.i=i;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Simple))return false;
		return this.i==((Simple)obj).i;
	}
	
}
public class InterfaceExample {
	public static void main(String[] args) {
		Iter it= new D1();
		it.m1();
		it.m2();
		
		WasherMan wash = new WasherMan();
		wash.wash(new  Car2() );
		Simple s1= new Simple(12);
		Simple s2= new Simple(12);
		System.out.println(s1==s2);// false bcz it will check according to object
		System.out.println(s1.equals(s2));// true because equals check value 
	}

}
