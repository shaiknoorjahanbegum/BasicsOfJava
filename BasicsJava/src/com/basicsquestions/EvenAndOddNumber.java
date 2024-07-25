package com.basicsquestions;

import java.util.Scanner;

public class EvenAndOddNumber {
	//normal method 
	public static String evenOdd(int n)
	{
		if(n%2==0)return "number is even";
		else return "number is odd";
	}
	//ternary operator 
	public static String method(int n)
	{
		String result=n%2==0?"even":"odd";
		return result;
	}
	//by using bit wise and operaator
	public String bitwiseAnd(int n)
	{
		if((n&1)!=1)
			return "even no";
		else 
			return "odd no";
	}
	//bitwise or operator 
	public void bitwiseOr(int n)
	{
		if((n|1)>n)
			System.out.println("even");
		else 
			System.out.println("odd");
	}
	//bitwise xor
	public void bitwiseXor(int n)
	{
		if((n^1)==n+1)
			System.out.println("even");
		else 
			System.out.println("odd");
	}
	//by using shift operator 
	public void shiftOperator(int n)
	{
		if ((n >> 1) << 1 == n) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
	}
	public String divisionOperator(int n)
	{
		if ((n / 2) * 2 == n) 
			return "It is an even number";
        else 
        	return "It is an odd number";
        
	}
	public static void main(String[] args) {
		//Different method to find the number is even or odd
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		//first method 
		System.out.println(evenOdd(n));
		System.out.println(method(329));
     	EvenAndOddNumber o= new EvenAndOddNumber();
		System.out.println(o.bitwiseAnd(90));
		o.bitwiseOr(98);
		o.bitwiseXor(21);
		o.shiftOperator(980);
		o.divisionOperator(99);
     	System.out.println(o.divisionOperator(98));
		
		
		
		
		
		
	}

}
