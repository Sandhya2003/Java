package com.src.main;

public class ObjectCreationinInheritance {
public static void main(String[] args) {
	B obj=new B(5); // If you call B also the default constructor of super class also gets called.
}
}
class A{
	public A(){
		System.out.println("In A Const");
	}
	public A(int i) {
		System.out.println("In A Const Int");
	}
}
class B extends A{
	public B() {
		System.out.println("In B Const");
	}
	public B(int i) {
		System.out.println("In B Const Int");
	}
}
