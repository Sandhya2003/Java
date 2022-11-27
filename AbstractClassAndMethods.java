package com.src.main;

public class AbstractClassAndMethods {
public static void main(String[] args) {
	MaheshPhone obj= new SureshPhone();  // cannot initiate the abstract class
	obj.call();
	obj.move();
	obj.dance();
	obj.cook();
	
}
}
abstract class MaheshPhone{   
	public void call() {
		System.out.println("Calling...");
	}
	public abstract void move();  //  Abstract Methods should have abstract class vice versa need not bee true.
	public abstract void dance();
	public abstract void cook();
}
abstract class RameshPhone extends MaheshPhone{
	public void move(){
		System.out.println("Moving....");
	}
}
class SureshPhone extends RameshPhone{     // Concrete class
	public void dance() {
		System.out.println("Dancing...");
	}
	public void cook() {
		System.out.println("Cooking....");
	}
}