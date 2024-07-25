package com.basicsquestions;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		//Arthematic operator
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1= sc.nextInt();
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println("Sum :"+sum);
		//unary operator
		int u=20;
		u=-u;
		System.out.println("unary operator: "+u);
		//assignment operator
		int num;
		String name;
		num =34;
		name="jeelan";
		System.out.println(num+" .."+name);
		int s=u+=num;
		System.out.println("Assignment operator"+s);
		//Relational operator 
		System.out.println("Realtional operator "+(s==num));
		//ternary operator
		int a=50;
		int b=30;
		int c=a>b?a:b;
		System.out.println("Ternary operator :"+c);
		//logical operator 
		if(a>b&&a>c)
			System.out.println("A is the big");
		else 
			System.out.println("a is not big");
		//bitwise operator 
		System.out.println("or operator"+(a|b)+" and operator"+(a&b)+" xor operator "+(a^b)+" not operator"+(~a));
		//shift operator 
		//signed right shift 
		int sign=64;
		System.out.println("signed left shift "+(sign<<2));// x=x*2^n
		System.out.println("signed right shift "+(sign>>2));
		System.out.println("unsigned right2"
				+ " shift "+(sign>>>2));
		
		//increment and decrement operator 
		int in = 11;
		++in;
		System.out.println(in);//preincrement 
		int ini=11;
		ini++;
		System.out.println(ini);//post increment 
		int h=10;
		int je = 20;
		int dm=++h+ ++je;
		System.out.println(h+" ....:/"+je+"...:)"+dm);
		int demon = 10;
		int g=++demon;
		System.out.println(demon+";;;;"+g);
		int demon1=10;
		int g1=demon++;
		System.out.println(demon1+";;;;;"+g1);
		int demon2=10;
		int g2= --demon2;
		System.out.println(demon2+";;;;"+g2);
		int demon3=10;
		int g3=demon3--;
		System.out.println(demon3+"  ....  "+g3);
		
		
		
	}

}
