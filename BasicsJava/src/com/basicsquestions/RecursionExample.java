package com.basicsquestions;
class Sum
{
	public static void sum(int i,int j)
	{
		if(i>j)return ;
		System.out.println(i);
	 sum(i+1,j);
	}
	public static int sumDigit(int n)
	{
		if(n==0) return 0;
		return n%10+sumDigit(n/10);
	}
	public static int sumOfAll(int n)
	{
		if(n==0)return 0;
		int a= n%10+sumOfAll(n/10);
		if(a>9)
		{
			return sumOfAll(a);
		}
		return a;
	}
	public static int fact(int n)
	{
		if(n==0)return 1;
		return n*fact(n-1);
	}
	public static int  isStrong(int n)
	{
		if(n==0)return 0;
		return fact(n%10)+isStrong(n/10);
	}
	
	public static int count(int n)
	{
		if(n==0)return 0;
		return 1+count(n-1);
	}
	public static int isArmStrong(int n, int pow)
	{
		if(n==0)return 0;
		return (int)Math.pow(n%10, pow)+isArmStrong(n/10,pow);
	}
	public static int palindrome(int n,int sum)
	{
		if(n==0)return sum;
		sum=(sum*10)+(n%10);
		return palindrome(n/10,sum);
	}
	
}


public class RecursionExample {
	public static void main(String[] args) {
		Sum s= new Sum();
		s.sum(1, 10);
		System.out.println(s.sumDigit(123));
		System.out.println(s.sumOfAll(12345));
		System.out.println(s.fact(4));
		if(s.isStrong(145)==145)
			System.out.println("Strong ");
		else 
			System.out.println("not strong ");
		
		//
		if(153==s.isArmStrong(153,s.count(153)))
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
	}

}
