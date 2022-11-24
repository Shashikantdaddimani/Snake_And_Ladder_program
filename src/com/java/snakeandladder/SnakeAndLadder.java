package com.java.snakeandladder;

import java.util.Random;

/**
 * The Player then checks for a Option They are No Play,Ladder and Snake
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
		
		int option = Ra.nextInt(3);
		switch(option)
		{
		case 0: System.out.println("No Play!!");
				break;
		case 1: System.out.println("Ladder!");
				userPosition = userPosition + dice;
				
				break;
		default: System.out.println("Snake!");
				userPosition = userPosition - dice;
				
				if(userPosition<0)
				{ userPosition = 0; 
				}
		}
		System.out.println("Presnt Position of the User: "+userPosition);
	}

}
