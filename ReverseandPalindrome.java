package com.src.main;
import java.util.*;
public class ReverseandPalindrome {
public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter number:");
	int n=scanner.nextInt();
	int t=n;
	int r,sum=0;
	while(n>0) {
		r=n%10;
		n=n/10;
		sum=(sum*10)+r;}
	System.out.print(sum);
	if(t==sum) {
		System.out.print("\nIt is a Palindrome");
		}
	else
		System.out.print("\nIt is not a Palindrome");
	
	
	
}
}
