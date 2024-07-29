package com.basicsOOPs;

//Example 1
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3424);
			} catch (InterruptedException e) {
			 System.out.println("....");
			}
		}
	}
}
class My implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" child ...");
		}
	}
	
}
//thread scedular is used to schedule the thread 

class One implements Runnable
{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}	
}

//getName method
class Two implements Runnable
{

	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName());
	}
}
//setName
class Three implements Runnable
{

	@Override
	public void run() {
	Thread.currentThread().setName("noorjahan ");
	  System.out.println("Thread name in run method: " + Thread.currentThread().getName());
	}
	
}
//join 
class Four extends Thread {
    public void run() {
        try {
            // This code runs in the new thread
            for (int i = 65; i <= 75; i++) {
                System.out.print((char) i + " ");
            }
            System.out.println(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//synchronization
class Yoongi
{
	public synchronized void m1(String s)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(" m1 called ");
			try {
				Thread.sleep(1234);
			} catch (InterruptedException e) {
				
			}
		}
	}
	public static synchronized void m2(String s)
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(" m2 called ");
			try {
				Thread.sleep(1234);
			} catch (InterruptedException e) {
				
			}
		}	}
}
class Min extends Thread
{
	Yoongi yo;
	String s;
	public Min(Yoongi yo,String s)
	{
		this.yo=yo;
		this.s=s;
	}
	public void run()
	{
		yo.m1(s);
		yo.m2(s);
		
	}
}
//DaemonThread 
class Dem extends Thread
{
	
}

//DeadLock
class Exam
{
	public synchronized void m1(Exam1 e)
	{
		System.out.println("m1 of Examclass ");
		System.out.println(" Exam class callin Exam 1 class tag methoo");
		e.tag();
		
	}
	public synchronized void tag( ){
		System.out.println("tag method of exam class");
	}
}
class Exam1
{
	public synchronized void m1(Exam e)
	{
		System.out.println("m1 of Exam1 class ");
		System.out.println(" Exam1 class callin Exam class tag methoo");
		e.tag();
		
	}
	public synchronized void tag( ){
		System.out.println("tag method of exam1 class");
	}
	
}
class Th1 extends Thread
{
	Exam e= new Exam();;
	Exam1 e1 = new Exam1();
	public void run()
	{
		e.m1(e1);
	}
	public void m2()
	{
		this.start();
		e1.m1(e);
	}
}
public class MultiThreadingExample {
	public static void main(String[] args) {
//		MyThread m= new MyThread();
//		m.run();
//		m.start();
//		My m = new My();
//		Thread t= new Thread(m);
//		t.start();
		
		
		//one
//		System.out.println(Thread.currentThread());
//		One o= new One();
//		Thread t = new Thread(o);
//		System.out.println(t);
//		t.start()

		//two
//		System.out.println(Thread.currentThread().getName());
//		Two u = new Two();
//		Thread t= new Thread(u);
//		t.start();
		
		//three
		//Thread.currentThread().setName("janu");
//		Three t= new Three();
//		Thread n= new Thread(t);
//		n.run();
		
		//four
//		 Four f = new Four();
//	        f.start(); 
//	        for (int i = 3; i <= 9; i++) {
//	            System.out.println(i);
//	        }
		
		//synchronization
//		Yoongi yo= new Yoongi();
//		Min m = new Min(yo,"noori");
//		Min m1= new Min(yo,"jahan");
//		m.start();
//		m1.start();
//		
//		demon thread
//		System.out.println(Thread.currentThread().isDaemon());
//		Dem d = new Dem();
//		System.out.println(d.isDaemon());
//		d.setDaemon(true);
//		System.out.println(d.isDaemon());
		
		Th1 t = new Th1();
		t.m2();
	}
}
