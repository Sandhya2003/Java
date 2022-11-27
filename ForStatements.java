package com.src.main;

public class ForStatements {
public static void main(String[] args) {
	
	for(int i=2;i<9;i++) {
	System.out.println("10000 at i% interest = "+ String.format("%.2f",calculateInterest(10000.0,i)));
	}
	for(int i=8;i>1;i--) {
		System.out.println("10000 at i% interest = "+ String.format("%.2f",calculateInterest(10000.0,i)));	
	}
	System.out.println("Is prime number "+isPrime(5));
	int count=0;
	for(int i=0;i<50;i++) {
	if(isPrime(i)) {
		count++;
		System.out.println("Number "+i+" is a prime number");
		if(count==0) {
			System.out.println("Exiting loop");
			break;
		}
	}
}
	
}

public static double calculateInterest(double amount,double interestRate) {
	
	return(amount*(interestRate/100));
}
public static boolean isPrime(int n) {
	
	{if(n==1) {
		return false;
	}
	for(int i=2; i<=n/2;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
	}
}
}
	
	
	


