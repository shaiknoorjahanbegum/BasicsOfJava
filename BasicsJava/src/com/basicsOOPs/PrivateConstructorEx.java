package com.basicsOOPs;
//for private construct object  object cannot be created outside the class but created within the class 
// we need to create factory method which is elper method 
//step -1 accessmodifier public 
//step-2 modifier static 
// return type class type
//get instance ,method 

class Constructor
{
	private Constructor()
	{
		
	}
	public static Constructor getInstance()
	{
		return new Constructor();
	}
}
public class PrivateConstructorEx {
	public static void main(String[] args) {
		Constructor con = Constructor.getInstance();
		Constructor con2 =Constructor.getInstance();
		System.out.println(con==con2);// return false bcz every time new object is created 
	}
}
