package com.src.main;
import java.util.*;
public class SwappingNumbers {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value of a:");
		int a=scanner.nextInt();
		System.out.println("Enter value of b:");
		int b=scanner.nextInt();
		//Using XOR logic gate we can save so many bytes 1 1 -> 0, 0 0 ->0, 1 0-> 1, 0 1-> 1;
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		// Using a and b consumes some bytes.Now here= a=5,b=4 so we will get according to that.
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		// Another method to swap numbers
		b=a+b-(a=b);
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
}
