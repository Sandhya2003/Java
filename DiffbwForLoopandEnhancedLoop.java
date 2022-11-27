package com.src.main;

public class DiffbwForLoopandEnhancedLoop {
public static void main(String[] args){
	int values[]= {5,6,1,2,9};
	//for loop
	for(int i=0;i<5;i++)
	{
		System.out.println(values[i]);
	}
	//enhanced for loop
	for(int i : values){ 
		System.out.println(i);
	}
}
}
