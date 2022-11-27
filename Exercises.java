package com.src.main;

public class Exercises {
	public static void main(String[] args) {
		int number =8;
        if(number>0)
			System.out.println("Positive");
		else if(number<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
        double KilometersPerHour =10.5;
        long toMilesPerHour= (long)(KilometersPerHour/1.609);
        long MilesPerHour = Math.round(toMilesPerHour);
        if(KilometersPerHour <0)
        	System.out.println(-1);
        else if(KilometersPerHour >0)
        	System.out.println(KilometersPerHour+"km/h ="+ MilesPerHour + "mi/h");
        
        	
        
       
        
        
        
	
}

}
