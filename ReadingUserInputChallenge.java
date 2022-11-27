package com.src.main;
 import java.util.Scanner;
public class ReadingUserInputChallenge {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int counter=0;
	int sum=0;
	while(true) {
		int order=counter+1;
		System.out.println("Enter number # "+order+":");
		boolean isAnInt= scanner.hasNextInt();
		if(isAnInt) {
			int number= scanner.nextInt();
			counter++;
			sum+=number;
			if(counter==10) {
				break;
			}
		}
		else {
			System.out.println("Invalid Number");
		}
		scanner.nextLine();//handle end of line (enter key)
		
	}
	System.out.println("sum="+sum);
	scanner.close();
	

}
}
//or we can even write while(counter<10) instead of while(true)
// if we write while(counter<10) then no need to write if(counter==10) that loop.