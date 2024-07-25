package com.basicsOOPs;
class Animal
{
	public void drink()
	{
		System.out.println("all animals drink water");
	}
	public void sound()
	{
		System.out.println("each element make different sound");
	}
}
class Cat extends Animal
{
	public void drink()
	{
		System.out.println("cat drinks milk");
	}
	public void sound()
	{
		System.out.println("cat sounds meow ...");
	}
	public void eats()
	{
		System.out.println("cats loves to eat rat");
	}
}

public class TypeCastingExample {
	//1.primitive typecasting ->1.widening 2.narrowing
	//non primitive type casting -> upcasting 2.downcasting
	public  void widerning()//primitvie type casting
	{
		byte a=10;
		int b=a;
		System.out.println(b);// converting lower range to higher range 
		char c='a';
		int d=c;
		System.out.println(d);
	}
	public  void narrowing()//non primitive type casting
	{
		double d= 10.5;
		int c=(int)d;
		System.out.println(c);
		int sum=(int)Math.pow(5, 2);
		System.out.println(sum);
		
	}
	//upcasting 
	
	public static void main(String[] args) {
		TypeCastingExample c= new TypeCastingExample();
//		c.widerning();
//		System.out.println();
//		c.narrowing();
		Animal animal = new Cat();//upcasting 
		animal.drink();
		animal.sound();
		Cat cat= (Cat)animal;
		cat.eats();//downcasting 
	}

}
