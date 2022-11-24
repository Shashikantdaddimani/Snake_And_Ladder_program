package com.java.snakeandladder;

import java.util.Random;

/**
 * The Player rolls the die to get a number Between 1 to 6.
 */

public class SnakeAndLadder {

	public static void main(String[] args) {
		Random Ra = new Random();
		System.out.println("Welcome to the Snake And Ladder Program");
		int userPosition = 0;
		System.out.println("----Game Starts----");
		System.out.println("Initial position of user: "+userPosition);
		
		int dice = Ra.nextInt(6) + 1 ;
		System.out.println("Dice Rolled: "+dice);
	}

}
