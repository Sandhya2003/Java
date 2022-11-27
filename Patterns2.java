package com.src.main;
import java.util.*;
public class Patterns2 {
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter value of n:");
int n=scanner.nextInt();
int i,j;
for(i=0;i<n;i++) {
	for(j=0;j<=i;j++) {
		if((i+j)%2==0) {
		System.out.print("1");}
		else
			System.out.print("0");
	}
	System.out.println();
}
for(i=1;i<=n;i++) {
	for(j=1;j<=i;j++) {
		System.out.print(i+" ");
	}
	System.out.println();
}
//Fibonacci series
int k,a=1,b=1;
k=0;
System.out.print("1 1 ");
while(k<=50) {
k=a+b;
System.out.print(k+" ");
a=b;
b=k;
}

}
}
