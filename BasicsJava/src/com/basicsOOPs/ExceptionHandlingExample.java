package com.basicsOOPs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
//unserdefined exception
class Account
{
	private int balance;
	public int getBalance()
	{
		return balance;
	}
	public Account(int balance)
	{
		this.balance=balance;
	}
	public void withDraw(int amount) throws InsufficientBalanceException
	{
		if(balance<amount)
		{
			System.out.println(InsufficientBalanceException("insufficiemt baslance "));
		}
		balance-=amount;
	}
	private Object InsufficientBalanceException(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException()
	{
		super("balance is less");
	}
	public InsufficientBalanceException(String name)
	{
		super(name);
	}
}




//userdefined exception 

class Matrimony extends RuntimeException {
    
    public void click() throws AgeInsufficientException {
        int age = 23;
        if (age <= 30 && age >= 25) {
            System.out.println("Ready for marriage");
        } else {
            throw new AgeInsufficientException("Not eligible for marriage");
        }
    }
}

class AgeInsufficientException extends Exception {
    
    private String message;

    public AgeInsufficientException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
public class ExceptionHandlingExample {
	public static void m1()
	{
		String j="java";
		try {
			int i=Integer.parseInt(j);
			System.out.println(i);
			
		} catch (NumberFormatException e) {
			System.out.println("handled");
		}
		finally
		{
			System.out.println("final method in java");
		}
	}
	public static void checkedExceptions()
	{
		System.out.println("starting point");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("handled....");
		}
	}
	public static void checkedExceptionSecond()
	{
		System.out.println("Second");
		try {
			FileReader fr= new FileReader("C:\\Users\\shaik noorjhan\\OneDrive\\Pictures\\BTS-Taehyung-taeheart_-41243875-1366-2048.jpg\"");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("janu");
		}
	}
	public static void div() throws Exception
	{
		System.out.println(20/0);
	}
	public static void main(String[] args) throws InterruptedException {
//	Null pointer excweption
		String s=null;
//		System.out.println("null pointer exception example");
//		try {
//			System.out.println(s.length());
//		} catch (NullPointerException e) {
//			System.out.println("handled");
//		}
		int a=12;int b=0;
//		try {
//			System.out.println(a/b);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("handled");
//			b=20;
//			System.out.println(b);	
//		}
		
		
		  
//		String m="IU";
//		System.out.println(m);
//		try {
//			int j=Integer.parseInt(m);
//			System.out.println(j*10);
//			
//		} catch (Exception e) {
//			System.out.println("Handled");
//		}
//		int[] a1= {32,432,32,342,34,23};
//		try {
//			System.out.println(a1[10]);
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("handled");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		//multiple try catch 
//		
//		try {
//			System.out.println(a/b);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("Handled");
//		}catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("handled for array index bound of exception ");
//		}
		
		
		//m1();
		//checkedExceptionSecond();
		
		
//		try {
//			div();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//			Thread.sleep(240);
//		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the amount :");
//		int amount=sc.nextInt();
//		Account acc= new Account(2000);
//		try {
//			acc.withDraw(amount);
//			System.out.println("withdraw amount : "+amount);
//		} catch ( Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		 Matrimony matrimony = new Matrimony();
	        try {
	            matrimony.click();
	        } catch (AgeInsufficientException e) {
	            System.out.println(e.getMessage());
	        }
		
	}
}