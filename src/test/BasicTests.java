package test;

import java.util.ArrayList;

import main.SimpleBattleship;

public class BasicTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleBattleship ship = new SimpleBattleship();

		ArrayList<String> locations = new ArrayList<>();
		locations.add("2");
		locations.add("3");
		locations.add("4");

		ship.setLocations(locations);

		String guess = "2";
		String result = ship.checkGuess(guess);
		String testResult = "failed";
		if (result.equals("hit")) {
			testResult = "passed";
		}
		System.out.println(testResult);
	}

}
