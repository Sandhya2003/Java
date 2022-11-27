package com.src.main;

public class Exercise {
public static void main(String[] args) {
System.out.println(getdurationString(65,45));
System.out.println(getdurationString(1206L));
}
	private static String getdurationString(long Minutes,long seconds) {
   	 if((Minutes<0)|| (seconds<0) || (seconds>59)) {
   		
   		 return "Invalid";
   	 }
   	 
   	 long hours=Minutes/60;
   	 long remainingMinutes= Minutes%60;
   	 return hours +"hr "+ remainingMinutes +"min " + seconds+ "sec";
   	 
}
	private static String getdurationString(long seconds) {
	   	 if(seconds<0){
	   		 
	   		 return "Invalid";
	   	 }
	   	 
	   	 long Minutes = seconds/60;
	   	 long remainingSeconds= seconds%60;
	   	 
	   	 return getdurationString(Minutes, remainingSeconds);

}
}
