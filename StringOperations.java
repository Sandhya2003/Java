package com.src.main;
import java.util.*;
public class StringOperations {
public static void main(String[] args) {
	String s1,s2;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two strings:");
	s1= sc.nextLine();
	s2=sc.nextLine();
	String s3= s1.concat(s2); // We can even add by s1+s2
	System.out.println("Result on concatenation:"+s3);
	int len1 = s1.length();
	int len2 = s2.length();
	System.out.println("Length of string 1:"+len1);
	System.out.println("Length of string 2:"+len2);
	s1= s1.toUpperCase();
	System.out.println(s1);
}
}
