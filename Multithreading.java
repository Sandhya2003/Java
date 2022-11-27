package com.src.main;
class Hi extends Thread{
	public void run(){ 
		for(int i=0;i<5;i++) {
		System.out.println("Hi");
		try {Thread.sleep(1000);} catch(Exception e) {} //This one is for creating threading and also giving a time gap between outputs.
	}
	}
}
class Hello extends Thread{
	public void run(){
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		try {Thread.sleep(1000);} catch(Exception e) {}
	}
	}
}

public class Multithreading {
public static void main(String[] args) {
	Hi obj1=new Hi();
	Hello obj2=new Hello();
	obj1.start(); //Instead of calling method name we say start. start method is there in thread class.
	try {Thread.sleep(10);} catch(Exception e) {} //This makes Hi run first and then Hello. If we remove this you can observe at some point of time hello runs faster than hi.
	obj2.start();
}
}
