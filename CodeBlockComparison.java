package com.src.main;

public class CodeBlockComparison {
	public static void main(String[] args){
		calculateScore(true,800,5,100);
		calculateScore(true,10000,8,200);
	}
    public static void calculateScore(boolean gameOver,int score, int LevelCompleted,int bonus){
		    if(gameOver) {
			int finalScore = score+ (LevelCompleted*bonus);
			finalScore +=1000;
			System.out.println("Your final score was " + finalScore);
		    }
	        }

     }
