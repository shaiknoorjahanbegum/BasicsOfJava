package com.basicsOOPs;

public class ThisKeyWord {
	int i;
	public void initI(int i)
	{
		this.i=i;
	}
	public static void main(String[] args) {
		ThisKeyWord m= new ThisKeyWord();
		m.initI(4);
		System.out.println(m.i);
	}
}
