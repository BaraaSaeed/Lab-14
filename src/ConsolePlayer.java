import java.util.Scanner;

/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */

public class ConsolePlayer extends Player {

	Scanner scnr = new Scanner(System.in);

	public ConsolePlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		String userStringInput = null;
		// String randRoshamboToString;
		// Roshambo randRoshambo;
		userStringInput = Validator.getString(scnr, "Rock, Paper, or Scissors? (R/P/S)");
		if (userStringInput.substring(0, 1).equalsIgnoreCase("R")) {
			return Roshambo.ROCK;
		} else if (userStringInput.substring(0, 1).equalsIgnoreCase("P")) {
			return Roshambo.PAPER;
		} else if (userStringInput.substring(0, 1).equalsIgnoreCase("S")) {
			return Roshambo.SCISSORS;
		} else {
			System.out.println("Invalid input!we will choose for you!");
			return Roshambo.randRoshambo();
		}

	}

}
