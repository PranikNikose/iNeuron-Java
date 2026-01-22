package com.ineuron.assignment2;

import java.util.Scanner;

class Guesser {
	int guessNum;

	public int guessNumber(Scanner scan) {
		do {
			System.out.println("Guesser kindly guess the number between 1 to 9");
			guessNum = scan.nextInt();
		} while (guessNum < 1 || guessNum > 9);
		return guessNum;
	}
}

class Player {
	int guessNum;

	public int guessNumber(Scanner scan, int playerNo) {
		do {
			System.out.println("Player " + playerNo + " kindly guess the number between 1 to 9");
			guessNum = scan.nextInt();
		} while (guessNum < 1 || guessNum > 9);
		return guessNum;
	}
}

class Umpire {

	int numFromGuesser;
	int[] playerGuesses;

	public void collectNumFromGuesser(Scanner scan) {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber(scan);
	}

	public void collectNumFromPlayers(Scanner scan, int numberOfPlayers) {
		Player p = new Player();
		playerGuesses = new int[numberOfPlayers];

		for (int i = 0; i < numberOfPlayers; i++) {
			playerGuesses[i] = p.guessNumber(scan, i + 1);
		}
	}

	void compare() {
		int winnerCount = 0;

		for (int guess : playerGuesses) {
			if (guess == numFromGuesser) {
				winnerCount++;
			}
		}

		if (winnerCount == 0) {
			System.out.println("Game lost! Try again");
		} else if (winnerCount == playerGuesses.length) {
			System.out.println("Game tied. All players guessed correctly");
		} else {
			System.out.print("Winner(s): ");
			for (int i = 0; i < playerGuesses.length; i++) {
				if (playerGuesses[i] == numFromGuesser) {
					System.out.print("Player " + (i + 1) + " ");
				}
			}
			System.out.println("won the game");
		}
	}
}

public class Launchgame {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char choice;

		do {
			System.out.println("Enter number of players:");
			int numberOfPlayers = scan.nextInt();

			Umpire u = new Umpire();
			u.collectNumFromGuesser(scan);
			u.collectNumFromPlayers(scan, numberOfPlayers);
			u.compare();

			System.out.println("Do you want to play again? (y/n)");
			choice = scan.next().toLowerCase().charAt(0);

		} while (choice == 'y');

		scan.close();
	}
}
