package com.basicsOOPs;

class I
{
	int i=40;
	public void m1()
	{
		System.out.println("I m the m1 method of I class ");
	}
}
class J extends I
{
	int i=100;
	int j=230;
	public void displayValue()
	{
		System.out.println("i= "+this.i);
		System.out.println(" j= "+this.j);
		System.out.println("superkeyword "+super.i);
	}
	@Override
	public void m1()
	{
		super.m1();
		System.out.println("m1 method of j class ....");
	}
}

public class SuperKeywordExample {
	public static void main(String[] args) {
		J j = new J();
		j.displayValue();
		j.m1();
		
	}

}
