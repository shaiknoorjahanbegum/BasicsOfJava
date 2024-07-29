package com.basicsOOPs;

import java.util.Scanner;

//communication between classes is know as assisation 
//1.Aggregation 2.Composition
class A // Aggregation :the dependency bwn the objects one obj exist without another object 
{
	public void m1()
	{
		System.out.println("class A logic of m1 method");
	}
	
}
class B
{
	public void m2()
	{
		A a1= new A();
		a1.m1();
	}
	
}
class Factorial //aggregation
{
	public long factorial(long n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
class Strong 
{
	public long strong(long n)
	{
		Factorial f= new Factorial();
		long res=0;
		for(;n>0;n/=10)res+=f.factorial(n%10);
		return res;
	}
}

//compostion : the dependency between the objects is must 
class Car1
{
	Enginee e;
	String color;
	String brand;
	double price;
	public Car1(Enginee e,String color,String brand,double price)
	{
		this.e=e;
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	public void Car1Details()
	{
		System.out.println(e);
		System.out.println(color);
		System.out.println(brand);
		System.out.println(price);
	}
	@Override
	public String toString() {
		return "Car1 [e=" + e + ", color=" + color + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}
class Enginee
{
	int number;
	String brand;
	public Enginee(int number , String brand)
	{
		this.number=number;
		this.brand=brand;
	}
	public void engineeDetails()
	{
		System.out.println("Enginee number : "+number+" enginee brand : "+brand);
	}
	@Override
	public String toString() {
		return "Enginee [number=" + number + ", brand=" + brand + "]";
	}
	
}

class Airtel
{
	String simName;
	public Airtel(String sinName)
	{
		this.simName=sinName;
	}
	public void callImplementation()
	{
		System.out.println(simName+" sim does not allow "+" using internet over call ");
	}
}
class Jio
{
	String simName;
	public Jio(String simName)
	{
		this.simName=simName;
	}
	public void callImplementation()
	{
		System.out.println(simName+" sim does not allow "+" using internet overcall ");
	}
}
class Battery
{
	String batteryName;
	public Battery(String barrteryName)
	{
		this.batteryName=batteryName;
	}
}
class Phone 
{
	String phoneName;
	Airtel airtel;
	Jio jio;
	Battery battery;
	public Phone(String phoneName,Battery b)
	{
		this.phoneName=phoneName;
		this.battery=b;
	}
	public void call()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Jio Sim \n"+
							"2.Airtel Sim \n");
		int simSelect= sc.nextInt();
		if(simSelect==1)
		{
			Jio j= new Jio("jio sim ");
			j.callImplementation();
		}
		if(simSelect ==2)
		{
			Airtel a = new Airtel("Airtel sim");
			a.callImplementation();
		}
	}
	
}

public class AssosiationExample {
public static void main(String[] args) {
//	B b = new B();
//	b.m2();
//	Strong s= new Strong();
//	long res= s.strong(145);
//	if(res==145)
//	{
//		System.out.println("I m a strong number");
//	}
//	else
//	{
//		System.out.println("not a strong number");
//	}
//	Car1 car = new Car1(new Enginee(234,"tata"),"white","maruthi",476);
//	car.Car1Details();
//	System.out.println("**********************");
//	//car.e.engineeDetails();
//	car.Car1Details();
	
	Phone p = new Phone ("oneplus",new Battery("LI-Ion"));
	p.call();
	
}
}
