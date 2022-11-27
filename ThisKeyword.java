package com.src.main;

public class ThisKeyword {
public static void main(String[] args) {
	Z obj= new Z(6);
	obj.show();
}
}
class Z{
	private int a; // here a is instance variable
	public Z(int a) // here a is local variable
	{
		this.a=a;   // here a is current instance variable
	}
	public void show() {
		System.out.println("a is "+a);
	}
}
