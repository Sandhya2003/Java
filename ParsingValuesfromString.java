package com.src.main;

public class ParsingValuesfromString {
public static void main(String[] args) {
	String numberAsString="2018";
   System.out.println("numberAsString ="+numberAsString);
   int number= Integer.parseInt(numberAsString);
   System.out.println("number="+number);
   numberAsString+=1;
   number+=1; 
   System.out.println("numberAsString="+numberAsString);
   System.out.println("number="+number);
   String numberAsStrings="2018.125";
   double numbers= Double.parseDouble(numberAsStrings);
   System.out.println("number="+number);
   numberAsStrings+=1;
   numbers+=1; 
   System.out.println("numberAsStrings="+numberAsStrings);
   System.out.println("numbers="+numbers);
}
}
