package com.basicsOOPs;
class E1// call to super is used to call the constructor of immediate super class
{
	int i;
	public E1(int i)
	{
		this.i=i;
		System.out.println("i= "+i);
	}
	public void display()
	{
		System.out.println("i= "+i);
	}
}
class F extends E1
{
	public F()
	{
		super(100);
		System.out.println("F class constructor");
	}
}
//second example
class Human 
{
	String name;
	public Human(String name)
	{
		this.name=name;
	}
}
class Doctor extends Human
{
	String name;
	int age;
	String specialized;
	public Doctor(String name ,int age,String specialized)
	{
		super(name);
		this.name=name;
		this.age=age;
		this.specialized=specialized;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", age=" + age + ", specialized=" + specialized + "]";
	}
	
}

//third example
class Book
{
	String bookName;
	String publication;
	int pages;
	double price;
	public Book(String bookName,String publication,int pages,double price)
	{
		this.bookName=bookName;
		this.publication=publication;
		this.pages=pages;
		this.price=price;
	}
}
class EBook extends Book
{
	String bookName;
	String publication;
	int pages;
	double price;
	String format;
	public EBook(String bookName, String publication, int pages, double price, String format) {
		super(bookName, publication, pages, price);
		this.format=format;
	}
	@Override
	public String toString() {
		return "EBook [bookName=" + bookName + ", publication=" + publication + ", pages=" + pages + ", price=" + price
				+ ", format=" + format + "]";
	}
	
}

public class CallToSuper {
	public static void main(String[] args) {
		F f =new F();
		//second example
		Doctor d= new Doctor("noorjahan" ,23,"javadeveloper");
		System.out.println(d.toString());
		//third example
		EBook book = new EBook("java","Bosco",34,3248.34,"software");
		System.out.println(book.toString());
	}

}
