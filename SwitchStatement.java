package com.src.main;

public class SwitchStatement {

	public static void main(String[] args) {

		System.out.println(args[5]);

		int switchNumber = 1;

		switch (switchNumber) {
		case 1:
			System.out.println("Number is 1");
			break;
		case 2:
			System.out.println("Number is 2");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Was 3 or 4 or 5");
			System.out.println("Actually it was" + switchNumber);
			break;
		default:
			System.out.println("Was not in range 1 to 5");
			break;
		}
		
		
		char colour = 'r';
		switch (colour) {
		case 'r':
			System.out.println("Red Colour");
			break;
		case 'b':
			System.out.println("Blue Colour");
			break;
		default:
			System.out.println("No Colour");
			break;
		}
		String month = "january";
		switch(month) {
		case "january":
			System.out.println("It is 1st month");
			break;
		case "february":
			System.out.println("It is 2nd month");
			break;
			default:
				System.out.println("It is a month");
				break;
		}
	}
}
