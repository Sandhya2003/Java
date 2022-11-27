package com.src.main;
class man implements Runnable{
	public void run(){ 
		for(int i=0;i<5;i++) {
		System.out.println("Hi");
		try {Thread.sleep(1000);} catch(Exception e) {} //This one is for creating threading and also giving a time gap between outputs.
	}
	}
}
class woman implements Runnable{
	public void run(){
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		try {Thread.sleep(1000);} catch(Exception e) {}
	}
	}
}

public class MultithreadingUsingInterface {
public static void main(String[] args) {
    man obj1=new man();
	woman obj2=new woman();
	Thread t1=new Thread(obj1);// Creating a new thread
	Thread t2=new Thread(obj2);
	t1.start(); // Start is not a method in Runnable so we have to create new thread and use it.
	try {Thread.sleep(10);} catch(Exception e) {} 
	t2.start();
}
}




