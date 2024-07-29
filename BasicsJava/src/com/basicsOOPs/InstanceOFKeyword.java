package com.basicsOOPs;
class Kim
{
	public void m1()
	{
		System.out.println("i am not in a good mood");
	}
	public void m2()
	{
		System.out.println("get job  as soon as possible");
	}
}
class Jk extends Kim
{
	@Override
	public void m2()
	{
		System.out.println("not getting a right platform to get a job");
	}
	public void m3()
	{
		System.out.println("my own logic ");
	}
}

public class InstanceOFKeyword {
	public static void main(String[] args) {
		//instance pf keyword is used to chedck object can access the properties of given class 
		Kim k = new Kim();
		System.out.println(k instanceof Kim);
		System.out.println(k instanceof Jk);
		System.out.println(k instanceof Object);
		Jk j = new Jk();
		System.out.println(j instanceof Kim);
		System.out.println(j instanceof Jk);
		System.out.println(j instanceof Object);
	}

}
