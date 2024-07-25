package com.basicsquestions;

public class StrongNumber {
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	//145=1+24+120
	public static boolean strong(int n)
	{
		int sum=0;
		int num=n;
		while(n>0)
		{
			int d= factorial(n%10);
			sum+=d;
			n/=10;
		}
		if(num==sum)
			return true;
		else 
			return false;
	}
	public static void range(int n,int m)
	{
		for(int i=n;i<=m;i++)
		{
			if(strong(i))
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		//System.out.println(strong(145));
		range(100,1000000);
	}

}
