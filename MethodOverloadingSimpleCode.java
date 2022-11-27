package com.src.main;

public class MethodOverloadingSimpleCode {
public static void main(String[] args) {
	sum(5,4);
	sum(5,5,6);
}
public static int sum(int a, int b){
	int d=a+b;
	System.out.println("Sum of two numbers = "+ d);	
	return 0;
}
public static int sum(int a, int b, int c){
	int e = a+b+c;
	System.out.println("Sum of three numbers = "+e);
	return 0;
}

}
