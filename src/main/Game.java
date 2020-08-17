package main;

import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {
		int numberOfGuesses = 0;

		GameHelper helper = new GameHelper();

		int random = (int) (Math.random() * 5);
		ArrayList<String> locations = new ArrayList<>();
		locations.add(String.valueOf(random));
		locations.add(String.valueOf(random + 1));
		locations.add(String.valueOf(random + 2));

		SimpleBattleship ship = new SimpleBattleship();
		ship.setLocations(locations);
		boolean isAlive = true;

		while (isAlive) {
			String guess = helper.getGuess("enter a number");
			String result = ship.checkGuess(guess);
			numberOfGuesses++;

			if (result == "kill") {
				isAlive = false;
				System.out.println("You took " + numberOfGuesses + " guesses.");
			}
		}
	}

}
