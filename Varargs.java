package com.src.main;

public class Varargs {
public static void main(String[] args) {
	 Display obj = new Display();
	 obj.show(5,6,7);
}
}
class Display
{
	public void show(int ...a) // You will use these dots when you don't know the number of variables.
	{
		for(int i:a) // Enhanced for loop
		{
			System.out.println(i);
		}
	}
}

