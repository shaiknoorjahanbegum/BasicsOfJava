package com.basicsquestions;

import java.util.Scanner;

public class FibonacciSeries {
	static int a=0,b=1,c;
	public static void fibonacci(int n)
	{
		int a=0,b=1,c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;b=c;
		}
		
	}
	//fibonacci series upto n 
	public static void fibonacciUptoN(int n)
	{
		int a=0,b=1,c;
		while(a<=n)
		{
			System.out.println(a);
			c=a+b;
			a=b;b=c;
		}
	}
	//fibonacci series between range
	public static void fibonacciRange(int n,int m)
	{
		int a=0,b=1,c;
		while(a<=m)
		{
			if(a>=n)
			{
				System.out.println(a);
			}
				c=a+b;
				a=b;b=c;
			
		}
	}
	//fibonacci series using recursion
	public static void reccursion(int n)
	{
		if(n>0)
		{
			c=a+b;
			a=b;b=c;
			System.out.println(c);
		reccursion(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the number:");
		//int n=sc.nextInt();
		//fibonacci(n);
		//fibonacciUptoN(n);
//		fibonacciRange(1,100);
		
		reccursion(10);
	}

}
