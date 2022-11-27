package com.src.main;

public class ExercisesOnMethodOverLoading {
	static double pi = Math.PI;

	public static void main(String[] args) {

		area(5);
		area(5, 4);
		printYearsAndDays(525600);
		printEqual(1, 0, 1);
		isCatPlaying(true, 37);
	}

	public static double area(double radius) {
		if (radius < 0) {
			System.out.println("Invalid value");
			return -1;
		}
		double AreaofaCircle = radius * radius * pi;
		System.out.println(AreaofaCircle);
		return 0;

	}

	public static double area(double x, double y) {
		if (x < 0 || y < 0) {
			System.out.println("Invalid value");
			return -1;
		}
		double AreaofaRectangle = x * y;
		System.out.println(AreaofaRectangle);
		return 0;
	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid");
		}
		long years = minutes / 525600;
		long days = (minutes % 525600) / 1440;
		System.out.println(years + "Years " + days + "days");

	}

	public static void printEqual(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Invalid value");
		} else if ((a == b) && (b == c)) {
			System.out.println("All are equal");
		} else if ((a == b) || (b == c) || (a == c)) {
			System.out.println("Neither all are are equal nor different");
		} else
			System.out.println("All are different");

	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (summer == true && (temperature > 25 && temperature <= 35)) {
			System.out.println(true);
			return true;
		} else if (summer == false && (temperature > 25 && temperature <= 45)) {
			System.out.println(true);
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}
}
