package com.basicsOOPs;
class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int n)//constructor overloading
	{
		length=n;
		breadth=n;
	}
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void display()
	{
		System.out.println(length+" ... "+breadth);
	}
	public void area()
	{
		int area= length*breadth;
		System.out.println(area);
	}
}
//copy constructor
class Mm
{
	int i;
	Mm(int i)
	{
		this.i=i;
	}
	Mm(Mm m)
	{
		this.i=m.i;
	}
}
public class ConstructorExample {
public static void main(String[] args) {
	Rectangle rect= new Rectangle(4);
	Rectangle rect1= new Rectangle(3,5);
	rect.display();
	rect.area();
	rect1.display();
	rect1.area();
	Mm m = new Mm(4);
	Mm m1 = new Mm(m);
	
	
}
}
