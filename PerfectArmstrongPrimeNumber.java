package com.src.main;
import java.util.*;
public class PerfectArmstrongPrimeNumber {
	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter value of n:");
int n= scanner.nextInt();
boolean b=isPerfect(n);
if(b)
	System.out.println("It is a perfect number");
else
	System.out.println("It's not");
boolean a=isArmstrong(n);
if(a)
	System.out.println("It is Armstrong number");
else
	System.out.println("It's not");
boolean p=isPrime(n);
if(p)
	System.out.println("It is Prime number");
else
	System.out.println("It is not");}
public static boolean isPerfect(int n) {
int i,sum=0;
for(i=1;i<n;i++){
	if(n%i==0)
		sum=sum+i;
		}
	if(sum==n) 
	     return true;
	else
		return false;
				
}
public static boolean isArmstrong(int n) {
	int r,digit=0;
	int temp=n;
    while(n>0) {
		r=n%10;
		n=n/10;
		digit=digit+(r*r*r);
}
    if(temp==digit)
    	return true;
    else
    	return false;
}
public static boolean isPrime(int n) {
	int i;
	for(i=2;i<n;i++){
		if(n%i==0)
			return false;
		break;}
	
		return true;
	
}
}
