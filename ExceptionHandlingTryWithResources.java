package com.src.main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ExceptionHandlingTryWithResources {
public static void main(String[] args) throws Exception  // Here this throws Exception we will write so that it will supress the errors.
{

try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) { // Here we created object in try itself so no need to use catch or finally blocks.
String str="";
str=br.readLine();
}
}
}
// To create your own exception we can write      throw new ArithmeticException();
                                                                                      