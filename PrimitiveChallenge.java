package com.src.main;

public class PrimitiveChallenge {
public static void main(String[] args) {
	byte a=10;
	short b=20;
	int c=30;
	long d= 50000L + 10L*(a+b+c); 
	System.out.println(d);
	short e= (short)(1000 +10*(a+b+c));
	System.out.println(e);
	double pounds = 200d;
	int kg = (int)(pounds*0.45359237);
	System.out.println(kg);
}
}
