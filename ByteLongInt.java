package com.src.main;

public class ByteLongInt {
public static void main(String[] args) {
	
	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
	System.out.println("Integer Minimum Value= " + myMinIntValue);
	System.out.println("Integer Maximum Value= " + myMaxIntValue);
	System.out.println("Busted Maximum Value= " + (myMaxIntValue+1));
	System.out.println("Busted Minimum Value= " + (myMinIntValue-1));
	byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value= " + myMinByteValue);
	System.out.println("Byte Maximum Value= " + myMaxByteValue);
    System.out.println("Busted Maximum Value= " + (byte)(myMaxByteValue+1));
	System.out.println("Busted Minimum Value= " + (byte)(myMinByteValue-1));
	short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value= " + myMinShortValue);
	System.out.println("Short Maximum Value= " + myMaxShortValue);
	System.out.println("Busted Maximum Value= " + (short)(myMaxShortValue+1));
	System.out.println("Busted Minimum Value= " + (short)(myMinShortValue-1));
	
	long myMinLongValue = Long.MIN_VALUE;
	long myMaxLongValue = Long.MAX_VALUE;
	System.out.println("Long Minimum Value= " + myMinLongValue);
	System.out.println("Long Maximum Value= " + myMaxLongValue);
	System.out.println("Busted Maximum Value= " +(myMaxLongValue+1));
	System.out.println("Busted Minimum Value= " + (myMinLongValue-1));
	byte myNewByteValue = (byte)(myMinByteValue/2);
	System.out.println(myNewByteValue);
}
}
