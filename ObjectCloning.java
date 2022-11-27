package com.src.main;

public class ObjectCloning {
public static void main(String[] args) throws CloneNotSupportedException{
	XYZ obj=new XYZ();
	obj.i=5;
	obj.j=6;
	XYZ obj1=(XYZ)obj.clone();
	System.out.println(obj1);
	System.out.println(obj);
}


}
class XYZ implements Cloneable{ // We are using marker interface.
	int i;
	int j;

@Override
public String toString() {
	return "XYZ{" +"i="+i+",j="+j+'}';
}
@Override
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}
}

