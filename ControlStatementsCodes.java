package com.src.main;

public class ControlStatementsCodes {
public static void main(String[] args) {
System.out.println("Sum of digits =" +sumDigits(125));	
System.out.println("It is Palindrome="+isPalindrome(121));

}
public static int sumDigits(int number) {
if(number <10) {
	return -1;
}
int sum=0;
while(number>0) {
	int digit=number%10;
	sum+=digit;
	number/=10;
}
return sum;}
public static boolean isPalindrome(int number) {
	int lastDigit,reverse=0;
	if(number>0) {
	while(number!=0){
		lastDigit =number%10;
		
		reverse=(reverse*10)+ lastDigit;
		number/=10;
	//return reverse;
	if(number == reverse) {
		return true;
	}}
	
	
	 	
       

}
	return false;
}}


