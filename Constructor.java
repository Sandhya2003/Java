package com.src.main;

public class Constructor {
	
		public static void main(String[] args) {
			Sandhya obj=new Sandhya(18); // class name is same as method name so it is Constructor.
		}
	}
	class Sandhya
	{
		public Sandhya()  //default constructor
		{   
			System.out.println("Hello, Sandhya");
		}
		public Sandhya(int i) //parameterized constructor
		{
			System.out.println("Sandhya is "+ i+" year old.");
		}
	}
/// If we have two constructors with same name but different parameters it is known as constructor overloading.
