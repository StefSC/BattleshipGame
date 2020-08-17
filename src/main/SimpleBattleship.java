package main;

import java.util.ArrayList;

public class SimpleBattleship {

	private ArrayList<String> locationCells;

	public void setLocations(ArrayList<String> locations) {
		this.locationCells = locations;
	}

	public String checkGuess(String guess) {
		int guessIndex = this.locationCells.indexOf(guess);
		String result = "miss";

		if (guessIndex >= 0) {
			this.locationCells.remove(guessIndex);

			if (this.locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}

		System.out.println(result);

		return result;
	}

}
