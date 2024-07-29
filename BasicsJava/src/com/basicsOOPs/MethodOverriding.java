package com.basicsOOPs;

class Parent 
{
	public void call()
	{
		System.out.println("i am the parent class method");
	}
	private void m2()
	{
		System.out.println("private method tring to override");
	}
	public static void m3()
	{
		System.out.println("this is m3 method which is static ");
	}
}
class Child extends Parent 
{
	public static void m3()
	{
		System.out.println("static methods cant be overriden and same for final methods also ");
	}
	@Override
	public void call()
	{
		System.out.println(" i am the child class method ");
	}
	//private methods can't be overriden 
	public void m2()
	{
		System.out.println("it is not overriding it is normal non static method of child class private methods cant be overriden ");
	}
}
public class MethodOverriding {
	//same method name with same signature 
	public static void main(String[] args) {
		Child c= new Child();
		c.call();
		

	}

}
