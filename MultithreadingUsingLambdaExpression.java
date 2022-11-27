package com.src.main;

public class MultithreadingUsingLambdaExpression {
public static void main(String[] args) throws Exception {
	
	Thread t1=new Thread(() ->
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
	);
	Thread t2=new Thread(() ->   //Lambda expression "() ->"  and also using anonymous class
	{
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
	);
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	t1.start();
	try {Thread.sleep(10);} catch(Exception e) {} 
	t2.start();
	System.out.println(t1.isAlive()); //here t1 thread is alive because there is usage of thread t1.
	t1.join();
	t2.join();
	System.out.println(t1.isAlive()); //here t1 thread is dead because there is no use of it.
	System.out.println("Bye");
	
}
}
