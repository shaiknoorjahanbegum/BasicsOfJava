package com.basicsOOPs;
class Bank
{
	int accno;
}
class AirConditioner
{
	int temp;
	public void temperature()
	{
		temp=45;
	}
	public void showTempp()
	{
		System.out.println("temperature >>"+temp);
	}
	public void changeTemp(int temp)
	{
		this.temp=temp;
	}
}
class M
{
	int i;
	static int j;
	public void initialize()
	{
		i++;
		j++;
	}
	public void display()
	{
		System.out.println(i+" "+j);
	}
}
public class ObjectCalssesExcample {//class
	int i;int j;
	static int k;
	public void display()
	{
		System.out.println(i+" "+j);
	}
	public static void main(String[] args) {
		ObjectCalssesExcample example= new ObjectCalssesExcample();//object 
		example.i=10;
		example.j=20;
		example.k=23;
		System.out.println(example.i+" "+example.j+" "+k);
		AirConditioner air = new AirConditioner();
		System.out.println(air.temp);
		air.showTempp();
		air.temperature();
		M m = new M();
		m.i=89;
		m.j=97;
		System.out.println(m.i);
		System.out.println(m.j);
		Bank b = new Bank();
		Bank ref= b;
		Bank gPay= b;
		System.out.println(ref.accno);
		System.out.println(gPay.accno);
		
	}

}