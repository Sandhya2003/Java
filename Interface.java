package com.src.main;
interface Abc
{
	void show();
}
public class Interface {
public static void main(String[] args) {
	Abc obj = () -> System.out.println("in show");
	obj.show();
}
}

