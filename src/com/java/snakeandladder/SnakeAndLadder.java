package com.java.snakeandladder;

import java.util.Random;

/**
 * Report the number of times the dice was played to win the game and also the position
after every die role
 */

public class SnakeAndLadder {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Welcome to the Snake And Ladder Program");
		int userPosition = 0;
		int count = 0;
		System.out.println("----Game Starts----");
		System.out.println("Initial position of user: "+userPosition);
		
		while (userPosition != 100) {
			count++;
			int dice = random.nextInt(6) + 1;
			System.out.println("Dice Rolled: " + dice);

			int option = random.nextInt(3);
			switch (option) {
			case 0:
				System.out.println("No Play!!");
				break;
			case 1:
				System.out.println("Ladder!");
				userPosition = userPosition + dice;
				if (userPosition > 100) {
					userPosition -= dice;
				}
				break;
			default:
				System.out.println("Snake!");
				userPosition = userPosition - dice;

				if (userPosition < 0) {
					userPosition = 0;
				}
			}
			System.out.println("Number of times user played "+count+" to reach: "+userPosition);
			System.out.println("Present Position of the User: " + userPosition);
		}
		System.out.println("User has rolled " + count + " times to win!");
	}

}
