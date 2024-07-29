package com.basicsOOPs;

class CompileTimePolymorphism 
{
	static int Multiply(int a, int b)
    {
        return a * b;
    }
	static double Multiply(double a, double b)
    {
        return a * b;
    }

}

class Runtime
{
	void Print()
    {
        System.out.println("parent class");
    }
}

class Poly extends Runtime
{
	void Print() { 
		System.out.println("subclass1");
	}
}

class Morphism extends Runtime
{
	void Print()
    {
        System.out.println("subclass2");
    }
}

public class PolymorphismExample {
public static void main(String[] args) {
	//compile time poly morphism
	System.out.println(CompileTimePolymorphism.Multiply(3, 23));
	System.out.println(CompileTimePolymorphism.Multiply(23.2, 242.2));
	
	//run time polymorphism 
	Runtime run= new Poly();
	run.Print();
	Runtime run1= new Morphism();
	run1.Print();
	
}
}
