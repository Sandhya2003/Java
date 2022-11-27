package com.src.main;

public class SuperKeyword {
public static void main(String[] args) {
	G obj =new G();
	obj.show();
	
}
}
class F{
	int i=5;
	int j=3;
	public F() {
		super(); // Either u say super() or not it will call super class default constructor only.
		System.out.println("F");
	}
	public F(int i) {
		System.out.println(i);
	}
	
}
class G extends F{
	int j=9;
	public G() {
		super();
		System.out.println("G");
	}
	public G(int i) {
		super(i);  // If you want to call parameterized constructor of super class then use super(parameter);
		System.out.println(i);
	}
	public void show() {
		System.out.println(i); // Even you are not calling i in this class it will inherit from above and print it here.
	    System.out.println(super.j);// Even though you are having j here if you want to call from the above class then we can use super keyword.
	}
}
