package com.basicsOOPs;
class S extends Object 
{
	int age;
	String name;
	String phoneNumber;
	String gender;
	public S(int age,String name,String phoneNumber,String gender)
	{
		this.age=age;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.gender=gender;
	}
	@Override
	public String toString() {
		return "S [age=" + age + ", name=" + name + ", phoneNumber=" + phoneNumber + ", gender=" + gender + "]";
	}
	
}
class E
{
	
}

public class ObjectClassExample {
	public static void main(String[] args) {
		Object s= new S(23,"noorjahan","9676517233","female");
		System.out.println(s.toString());
		
	}

}
