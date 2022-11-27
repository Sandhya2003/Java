package com.src.main;
import java.util.*;
public class Patterns {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the value of n:");
	int n=scanner.nextInt();
	int i,j;
	
	for(i=0;i<n;i++) 
	{
      for(j=0;j<n;j++)
         { 
    	  System.out.print("* ");
    	 }
      System.out.print("\n");
     }
	for(i=0;i<n;i++) {
		for(j=0;j<=i;j++) {
			System.out.print("* ");
		                   }
		System.out.println();
	                 }
	for(i=1;i<=n;i++) {
		for(j=1;j<=n;j++) {
			if(i==1 || i==n ||j==1||j==n) {
			System.out.print("*");}
			else {
				System.out.print(" ");}
		}
		System.out.print("\n");
	}
	for(i=1;i<=n;i++) {
		for(j=1;j<=n;j++) {
		int k=i+j-1;
		if(k>4) {
			System.out.print(k-4);
		}
		else
			System.out.print(k);}
		System.out.println("");}
	System.out.println();}
                      
                       }
