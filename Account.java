package com.src.main;

public class Account {
private String number;
private double balance;
private String customerName;
private String customerEmailAddress;
private String customerPhoneNumber;
public Account(String number,double balance,String customerName, String EmailAddress, String customerPhoneNumber){
	
}
public void deposit(double depositAmount) {
	balance+=depositAmount;
	System.out.println("Deposit of "+depositAmount + "made. New balance is"+balance);
}
public void withdrawal(double withdrawalAmount){
	if((balance-withdrawalAmount)<0){
		System.out.println("Only "+balance+"available. Withdrawal not processed");
	}
	else
		balance-=withdrawalAmount;
	System.out.println("Withdrawal of " + withdrawalAmount+ "processed. Remaining balance "+balance);
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmailAddress() {
	return customerEmailAddress;
}
public void setCustomerEmailAddress(String customerEmailAddress) {
	this.customerEmailAddress = customerEmailAddress;
}
public String getCustomerPhoneNumber() {
	return customerPhoneNumber;
}
public void setCustomerPhoneNumber(String customerPhoneNumber) {
	this.customerPhoneNumber = customerPhoneNumber;
}
}


