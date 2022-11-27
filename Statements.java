package com.src.main;

public class Statements {
public static void main(String[] args) {
	int a=35;
	if(a>=18)
		{System.out.println("Eligible to vote");
		System.out.println("I can vote");}
	else {
		System.out.println("Not Eligible to vote");
	}
	int b=100;
	if(b==100) {
		System.out.println("You got high score");
	}
	if(b!=100) {
		System.out.println("You got high score");
	}
	if((b>a) && (b>50)) {
		System.out.println("b is greater");
	}
	if((b>a) || (b>100)) {
		System.out.println("b is either greater than a or 100");
	}
	int c=50;
	if(c==50) {
		System.out.println("Yes");
	}
	boolean isCar = true;
	if(isCar==true) {
		System.out.println("Car is true");}
	if(!isCar) {
		System.out.println("Car is false");}
	int ageOfClient=20;
	boolean isEighteenOrOver = ageOfClient==20? true : false;
	System.out.println(isEighteenOrOver);
	}
	
	
}

