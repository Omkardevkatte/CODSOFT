package com.internsip.codsoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Created Random object to generate random numbers
		Random random = new Random();

		// to keep track of the number of rounds won by the user
		int roundsWon = 0;

		while (true) {

			// Generating Random Number from 1 to 100
			int numberToGuess = random.nextInt(100) + 1;
			boolean hasGuessedCorrectly = false;
			int maxAttempts = 5;

			System.out.println("Guess the number between 1 and 100:");

			for (int attempt = 1; attempt <= maxAttempts; attempt++) {
				System.out.print("Attempt " + attempt + ": ");
				int userGuess = scanner.nextInt();

				if (userGuess == numberToGuess) {
					System.out.println("Correct! You guessed the number.");
					hasGuessedCorrectly = true;
					roundsWon++;
					break;
				} else if (userGuess < numberToGuess) {
					System.out.println("Too low. Try again.");
				} else {
					System.out.println("Too high. Try again.");
				}
			}

			// Checked if the user did not guess the number correctly within the allowed
			// attempts
			if (!hasGuessedCorrectly) {
				System.out.println("Sorry, you didn't guess the number. It was " + numberToGuess + ".");
			}

			// Ask the user if they want to play another round
			System.out.println("Do you want to play again? (yes/no)");
			String playAgain = scanner.next();

			// Exit the loop if the user does not want to play again
			if (!playAgain.equalsIgnoreCase("yes")) {
				break;
			}
		}

		System.out.println("Game Over! You won " + roundsWon + " round(s).");
		scanner.close();
	}
}
