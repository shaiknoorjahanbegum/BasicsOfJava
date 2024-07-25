package com.basicsquestions;

import java.util.Scanner;

public class ReverseNumber {
	//reverse of number
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
	// sum of digit 
	public static int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	//sum of square of digit 
	public static int sumSquare(int n)
	{
		int sum=0;
		while(n>0)
		{
			//sum+=(n%10)*(n%10);
			sum+=(int)Math.pow(n%10, 2);
			n/=10;
		}
		return sum;
	}
	//sum of cube of digit 
	public static int sumCube(int n)
	{
		int sum=0;
		while(n>0)
		{
			//sum+=(n%10)*(n%10)*(n%10);
			sum+=(int)Math.pow(n%10, 3);
			n/=10;
		}
		return sum;
	}
	static int rev=0;
	//reverse of number using recurssion 
	public static void reverseRecursion(int n)
	{
		if(n<=0)return ;
		 
		rev=rev*10+n%10;
		reverseRecursion(n/10);
	}
	//by using string builder
	public static String builder(int n)
	{
		String s=n+"";
		StringBuilder sb = new StringBuilder(s);
		StringBuilder str = sb.reverse(); 
		return str.toString();
	}
	//sumof even odd digit 
	public static void sumOfEvenOdd(int n)
	{
		int sum=0,sum1=0;
		while(n>0)
		{
			if(n%2==0)
			{
				sum+=n%10;
				n/=10;
			}
			else
			{
				sum1+=n%10;
				n/=10;
			}
		}
		System.out.println("even sum "+sum+" odd sum "+sum1);
	}
	//power of number
	public static int power(int b,int e)
	{
		int i=1,pro=1;
		while(i<=e)
		{
			pro*=b;
			i++;
		}
		return pro;
	}
	//without using more variables
	public static int product(int a,int b)
	{
		int pro=1;
		while(b!=0)
		{
			pro*=a;
			--b;
		}
		return pro;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int n= sc.nextInt();
		//System.out.println(reverse(n));
		//System.out.println(sum(n));
//		System.out.println(sumSquare(n));
//		System.out.println(sumCube(n));
//		reverseRecursion(n);
//		System.out.println(rev);
		//System.out.println(builder(n));
		//sumOfEvenOdd(n);
//		System.out.println(power(3,2));
//		System.out.println(power(4,3));
		System.out.println(product(4,3));
	}

}
