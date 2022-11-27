package com.src.main;

public class ForStatementsCodes {
	public static void main(String[] args) {
		System.out.println("Sum of Odd numbers = "+isOdd(25));
		
	
		int count = 0;
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				count++;
				sum += i;

				System.out.println("Found Number = " + i);
			}
			if (count == 5) {
				break;
			}
		}
		System.out.println("Sum = " + sum);
	

	
}
	public static boolean isOdd(int number) {
		int sum=0;
		if(number<0) {
			return false;
		}
		for(number=0;number<=100;number++) {
			if(number%2==0) {
				return false;
			}
			if(!(number%2==0)) {
			
		
		number++;
		sum+=number;
		//return sum;
			}
		}


	return true;
	}
	
	}

