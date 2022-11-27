package com.src.main;

public class Overriding{
public static void main(String[] args) {
 Goutham obj= new Goutham();
 obj.show();
}
}
class Sri{  //Method overriding, Runtime polyMorphism, late binding, Dynamic binding.
	public void show() {
		System.out.println("Hi Sandhya");
	}
}
class Goutham extends Sri{
	public void show() {
		System.out.println("Hi Goutham");
	}
}