package com.src.main;

public class CodeBlock {
	public static void main(String[] args) {
		
		boolean gameOver=true;
		int score=800;
		int LevelCompleted = 5;
		int bonus = 100;
		calculateScore(true,score,LevelCompleted,bonus);
		if(gameOver) {
		         score= 10000;
		         LevelCompleted=8;
		         bonus=200;
		        int finalScore= score+(LevelCompleted*bonus);
		        System.out.println("Your final score was " + finalScore);}
		
	}
    public static void calculateScore(boolean gameOver,int score, int LevelCompleted,int bonus){
	    if(gameOver) {
		int finalScore = score+ (LevelCompleted*bonus);
		finalScore +=1000;
		System.out.println("Your final score was " + finalScore);
	
	}
	    
}
}
	


