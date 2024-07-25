package com.basicsquestions;

public class DecimalToBinary {
	public static void decToBin(int dec,int bin)
	{
		int i=1;
		while(dec>0)
		{
			bin = bin+dec%2*i;
			i*=10;
			dec/=2;
		}
		System.out.println(bin);
	}
	//in range 
	public static void decToBinRange(int n,int m)
	{
		for(int i=n;i<=m;i++)
		{
			int temp=i;
			int j=1;int bin=0;
			while(temp>0)
			{
				bin=bin+(temp%2)*j;
				j*=10;
				temp/=2;
			}
			System.out.println(bin);
		}
	}
	public static void binToDec(int bin,int dec)
	{
		int i=1;
		while(bin>0)
		{
			dec=dec+bin%10*i;
			i*=2;
			bin/=10;
		}
		System.out.println(dec);
	}
	public static void main(String[] args) {
		// n= 5 output =101
//		decToBin(11,0);
		//decToBinRange(1,10);
		binToDec(1011,0);
		
		
		
	}

}
