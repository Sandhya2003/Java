package com.src.main;

public class ExceptionHandlingTryCatch {
public static void main(String[] args) {
	int i,j,k=0;
	i=8;
	j=2;
	int a[]=new int[4];
	try {
		k=i/j;
		for(int c=0;c<=4;c++) {
			a[c]=c+1;
		}
		for(int value : a) {
			System.out.println(value);
		}
		}
	catch(ArithmeticException e){  // We can have multiple catch with one try.
		System.out.println("Cannot divide by zero"+e);// System.out.println("Cannot divide by zero");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Maximum we can enter 4");
	}
	catch(Exception e)  // We will write this class atlast because if we write it first it will directly come to this class instead of proceeding with other classes.
	{
		System.out.println("Unknown Exception");
	}
	//System.out.println(k);
	finally // Using finally code block.To print output in any case.
	{
		System.out.println("Finally Bye");
	}
}

}
