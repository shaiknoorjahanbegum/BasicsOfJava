package com.basicsquestions;

public class PerfectNumberProgram {
	public static boolean perfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)return true ;
		else return false;
	}
	//range
	public static void range(int n,int m)
	{
		int sum=0;
		for(int i=n;i<=m;i++)
		{
			if(perfect(i))
			{
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		//1+2+3=6
//		if(perfect(6))System.out.println("perfect number");
//		else System.out.println("not perfect number");
		range(1,100);
		
	}

}