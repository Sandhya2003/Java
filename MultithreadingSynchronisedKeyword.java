package com.src.main;
class Counter{
	int count;
	public void increment() {
		count++;
	}
}
public class MultithreadingSynchronisedKeyword {
public static void main(String[] args) throws Exception {
	Counter c=new Counter();
	Thread t1=new Thread(new Runnable() 
	{
		public void run() {
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		}
	});
	Thread t2=new Thread(new Runnable() 
	{
		public void run() {
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		}
	});
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	System.out.println("Count "+c.count);
}
}