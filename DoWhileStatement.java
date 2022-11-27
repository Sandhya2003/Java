package com.src.main;

public class DoWhileStatement {
public static void main(String[] args) {

int count;
count=1;
do {
	System.out.println("Count value was " + count);
	count++;
	if(count>100) {
		break;
	}
}
while(count!=105);

}

}
//DoWhile will execute at least once.