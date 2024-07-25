package com.basicsquestions;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int sum=0,count=0;
		while(n>0)
		{
			count++;n/=10;
		}
		n=num;
		while(n>0)
		{
			sum+=(int)Math.pow(n%10, count);
			n/=10;
		}
		n=num;
		if(n==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("not an Armstrong number");
	}

}
