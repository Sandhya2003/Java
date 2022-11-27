package com.src.main;

public class OperatorPrecedenceChallenge {
	public static void main(String[] args) {
		double a= 20.00d;
		double b= 80.00d;
		double c= (a+b)*100.00d;
		System.out.println(c);
		double d= c%40.00d;
		System.out.println(d);
		boolean Remainder=(d==0) ? true:false;
				System.out.println("Remainder= " +d);
		if(!Remainder) {
			System.out.println("Got Some Remainder");
		}
		
		
		
	}

}
