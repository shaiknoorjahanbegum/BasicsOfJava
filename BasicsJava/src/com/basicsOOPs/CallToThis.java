package com.basicsOOPs;
public class CallToThis {
	CallToThis()
	{
		System.out.println("no arguments ...");
	}
	CallToThis(int i)
	{
		this();
		System.out.println("one Argument ");
	}
	CallToThis(int i,int j)
	{
		this(10);
		System.out.println("two Argument ");
	}
	public static void main(String[] args) {
		CallToThis m = new CallToThis(3,4);
		
	}

}
