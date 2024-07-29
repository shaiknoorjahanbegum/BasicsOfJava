package com.basicsOOPs;
class Student
{
	private int id;
	private String name;
	private String gender;
	private String phoneNumber;
	private int age;
	public Student(int id, String name, String gender, String phoneNumber, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", age="
				+ age + "]";
	}
	
}
class Sim
{
	private String serviceProvider;
	private String phoneNumber;
	Sim(String serviceProvider , String phoneNumber)
	{
		this.serviceProvider=serviceProvider;
		this.phoneNumber=phoneNumber;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
public class EncapsulationExample {
	public static void main(String[] args) {
		Sim s= new Sim("Airtel","9676517233");
		System.out.println(s.getPhoneNumber()+" "+s.getServiceProvider());
		Student student = new Student(221,"noorjahan","female","9676517233",23);
		System.out.println(student.toString());
		
	}

}
