package com.basicsOOPs;

abstract class Shape
{
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color) 
    { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
	//creating one complete method 
	 public String getColor() { return color; } 
}
class Circle extends Shape
{
	double radius;

	 public Circle(String color, double radius) 
	    { 
	        super(color); 
	        System.out.println("Circle constructor called"); 
	        this.radius = radius; 
	    } 

	@Override
	double area() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "color :" +super.getColor()+"  area : "+area();
	}
	
}

public class AbstractionExample {

	public static void main(String[] args) {
		
		Shape s= new Circle("purple",23);
		System.out.println(s.toString());
	}

}