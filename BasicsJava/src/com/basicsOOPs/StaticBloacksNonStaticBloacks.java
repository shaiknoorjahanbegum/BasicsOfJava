package com.basicsOOPs;

public class StaticBloacksNonStaticBloacks {
	static int i=2;
	int j=30;
	static 
	{
		i=30;
		System.out.println("this is static block");
		System.out.println(i);
	}
	{
		System.out.println("this is non static bloack");
		i=30;
		System.out.println(i);
	}
	public static void main(String[] args) {
		
		StaticBloacksNonStaticBloacks s= new StaticBloacksNonStaticBloacks();
		
		
	}

}
