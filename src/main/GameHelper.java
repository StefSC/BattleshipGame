package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {

	public String getGuess(String prompt) {
		String inputGuess = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			inputGuess = reader.readLine();
			if(inputGuess.length() == 0) {
				return null;
			}
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return inputGuess;
	}

}
