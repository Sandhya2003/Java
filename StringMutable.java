package com.src.main;
public class StringMutable {
public static void main(String[] args) {
	StringBuffer sbf= new StringBuffer("Sandhya");
	sbf.append(" Sri");
	sbf.replace(0, 7, "Goutham");
	sbf.delete(8, 11);
	System.out.println(sbf);
}
}
