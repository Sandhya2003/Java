package com.src.main;

public class WhileStatement {
public static void main(String[] args) {
	int Number=4;
	int finishNumber=20;
	int evenNumbersFound=0;
	while(Number<= finishNumber) {
		Number++;
		if(!isEvenNumber(Number)) {
			continue;
		}
		System.out.println("Even number " +Number);
		evenNumbersFound++;
		if(evenNumbersFound>=5) {
			break;
		}
		
	}
	System.out.println("Total even numbers found " +evenNumbersFound);
	
	int count=1;
	while(count!=6) {
		System.out.println("Count value is " +count);
		count++;
	}
	count=1;
	while(true) {
		if(count==6) {
			break;
		}
		System.out.println("Count value is "+count);
		count++;
	}
}
public static boolean isEvenNumber(int Number) {
	if(Number%2==0) {
		return true;
	}
	else {
		return false;
	}
}

}
// while(true) means an infinite loop.