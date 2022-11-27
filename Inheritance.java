package com.src.main;

public class Inheritance {
public static void main(String[] args) {
	AddSubMul obj= new AddSubMul();
	obj.num1=5;
	obj.num2=4;
	obj.sum(); // If you won't write this you will get result as zero because initially the values will be zero.
	System.out.println(obj.result);
	obj.sub();
	System.out.println(obj.result);
	obj.mul();
	System.out.println(obj.result);
}
}
class Add{    //Super,parent,base class
	int num1,num2,result;
	public void sum()
	{
		result=num1+num2;
	}
}
// sub,child,derived class
class AddSub extends Add{    // Single level Inheritance
	public void sub() {
	 result=num1-num2;
	}
}
class AddSubMul extends AddSub{   //Multi level Inheritance
	public void mul() {
		result=num1*num2;
	}
}
