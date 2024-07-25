package com.basicsquestions;

public class PrimeNumber {
	public static void  prime(int n)
	{
		boolean flag=true;
		for(int i=1;i<n;i++)
		{
			if(i<=1)continue;
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("prime ");
		}
		else 
		{
			System.out.println("not prime");
		}
	}

	public static void main(String[] args) {
		prime(5);
		

	}

}
