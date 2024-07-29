package com.basicsOOPs;

import java.util.Scanner;

// A class whic consist of atmost one object 
//define static refernce varibale of class type 
//private constructor 
//factory methods 

class Theatre
{
	int seats=50;
	private static Theatre th=null;
	private Theatre()
	{
		
	}
	public static Theatre getInstance()
	{
		if(th==null)
		{
			return new Theatre();
		}
		return th;
			
	}
	public void reserved(int numSeats)
	{
		if(numSeats>seats)
		{
			System.out.println(numSeats+" that many seats are not available ");
			System.out.println(seats+" these are the available seats that u can book");
		}
		seats= seats-numSeats;
		System.out.println(numSeats+" these seats are reserved");
		System.out.println(seats+" these are the available seats that u can book");
	}
}

public class SingelTonClassEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ticetets");
		int numSeats=sc.nextInt();
		Theatre theatre = Theatre.getInstance();
		theatre.reserved(numSeats);
	}

}
