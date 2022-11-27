package com.src.main;

public class WrapperClass {
public static void main(String[] args) throws Exception
{
	int i=5;
	Integer ii = new Integer(i);// Boxing
	Integer jj=i;            //AutoBoxing
	int j=jj.intValue();     //UnBoxing
	int k=jj;                 // AutoUnboxing
	System.out.println(jj);
	System.out.println(k);
}
}
