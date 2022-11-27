package com.src.main;

public class DynamicMethodDispatch {
public static void main(String[] args) {
	D obj1= new D();
	E obj2 = new E();
	D d;
	d=obj2;
	d.show(); // Even you are calling class D it will call method based upon the instance that is object.
}
}
class D{
	public void show() {
		System.out.println("D");
	}
}
class E extends D{
	public void show() {
		System.out.println("E");
	}
}
