package com.src.main;

public class MethodOverloading {
public static void main(String[] args) {
	int newScore =calculateScore("Sandhya",590);
	System.out.println("New score is " + newScore);
	calculateScore(75);
	calculateScore();
	calculateFeetAndInchesToCentimeters(5,11);
	calculateFeetAndInchesToCentimeters(100);
}
public static int calculateScore(String playerName, int score) {
	System.out.println("Player " + playerName + " scored " + score + " points");
	return score*1000;
}
public static int calculateScore(int score) {
	System.out.println(" scored " + score + " points");
	return score*1000;
}
public static int calculateScore(){
	System.out.println("no player name, no player score.");
	return 0;
}
public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
	if((feet<0) || (inches<0) || (inches>12)) {
		System.out.println("Invalid feet or inch parameters");
		return -1;
	}
	double centimeters = (feet * 12) * 2.54;
	centimeters += inches * 2.54;
	System.out.println(feet + "feet, " + inches + "inches = " + centimeters +"cm");
	
	return centimeters;
}
public static double calculateFeetAndInchesToCentimeters(double inches){
	if(inches<0) {
		System.out.println("Invalid inches");
		return -1;}
	double feet = (int) inches/12;
	double remainingInches = (int) inches%12;
	System.out.println(inches + "inches is equal to " + feet + "feet and " + remainingInches+ "inches");
return calculateFeetAndInchesToCentimeters(feet,remainingInches);
}
}
