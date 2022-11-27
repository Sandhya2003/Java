package com.src.main;

public class OverLoading {
public static void main(String[] args) {
  C obj= new C();
  obj.show(5);
}
}
class C   // Method overloading,compile time PolyMorphism, Static binding, early binding.
{
	public void show(int i) {
		System.out.println("Hello "+i);
		}
	public void show(String s) {
		System.out.println("Hi "+s);
	}
}
