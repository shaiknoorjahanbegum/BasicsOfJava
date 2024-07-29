package com.basicsOOPs;
import com.basicsquestions.Color;

public class AccessModifiers  extends Color{
	//private , default  , protected , public 
	class N
	{
		private int i;
		public void displayN()
		{
			System.out.println(i);
		}
	}
	class M extends N
	{
		public void accessN()
		{
			//System.out.println(i);//not access private method bcz private access only wothin the class
			displayN();
		}
	}

	public static void main(String[] args) {
	//	N n = new N(); not able to create the object of private method class 
	//	n.displayN();
		
		AccessModifiers v = new AccessModifiers();//protected access modifier 
		System.out.println(v.colorName);

	}

}
