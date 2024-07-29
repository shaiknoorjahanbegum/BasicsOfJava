package com.basicsOOPs;

import java.util.Scanner;

//single level inheritance
class Fact
{
	public long factorial(long num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
class StrongNum extends Fact
{
	public long strong(long num)
	{
		long res=0;
		for(;num>0;num/=10)
		{
			res+=factorial(num);
		}
		return res;
	}
}

//Multi level inheritance
class A1
{
	public static void m1()
	{
		System.out.println("i am method of m1()");
	}
}
class B1 extends A1
{
	public void m2()
	{
		System.out.println("i am method of m2()");
	}
}
class  C1 extends B1
{
	public void m3()
	{
		m1();
		m2();
	}
}
//Hieraichal inheritance  : A superclass having more than one subclass is known as hierarical inheritance
class A2
{
	int i;
	public void m1()
	{
		System.out.println("i= "+i);
	}
}
class B2 extends A2
{
	int j;
	public void m2()
	{
		System.out.println("j = "+j);
	}
}
class C2 extends A2
{
	int k;
	public void m3()
	{
		System.out.println("k = "+k);
	}
}
//hybrid inheritance : A combination of more than one inheritance is known as hybrid inheritance 

public class IntertitanceExample {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		long n = sc.nextInt();
//		StrongNum  s= new StrongNum();
//		long res= s.factorial(n);
//		if(n==res)
//		{
//			System.out.println("i am strong number ");
//		}
//		else 
//		{
//			System.out.println(" i am not a strong number ..");
//		}
//		C1 c = new C1();
//		c.m3();
		
		C2 c = new C2();
		c.m3();
		c.m1();
		
	}

}
