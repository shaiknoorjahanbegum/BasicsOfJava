package com.basicsOOPs;
class Method
{
	public void m1()
	{
		System.out.println("i am the m1 method");
	}
	public void m1(int n)
	{
		System.out.println("i am m1 method of one argumnet "+n);
	}
	public void m1(int n , int m)
	{
		System.out.println("i am m1 method of two arguments "+n+"...<<<>>>"+m);
	}
}
class Car
{
	void accelerate()
	{
		System.out.println("Accelerated to 50kmph..");
	}
	void accelerate(int speed )
	{
		System.out.println("car accelerated to "+speed+"kmph");
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Method m = new Method();
		m.m1();
		m.m1(4);
		m.m1(2, 6);
		Car car= new Car();
		car.accelerate();
		car.accelerate(23);
	}

}
