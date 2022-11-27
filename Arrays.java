package com.src.main;
import java.util.*;  // To use random class.
public class Arrays {
public static void main(String[] args){
int a[]	= new int[5];
a[0]=34;
a[1]=21;
a[2]=25;
a[3]=42;
a[4]=12;
for(int i=0;i<5;i++) {
	System.out.println(a[i]);
}
int b[]=new int[10];
Random r= new Random();// Random is a library where u will get random numbers.
for(int i=0;i<10;i++) {
	b[i]=r.nextInt(50);
}
for(int i=0;i<10;i++)//we can even write this as for(int i=0;i<b.length;i++)
{
	System.out.println(b[i]);
}

}
}
