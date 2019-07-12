import java.util.Random;

/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */

public enum Roshambo {
	ROCK, PAPER, SCISSORS;

	@Override
	public String toString() {
		switch (this) {
		case PAPER:
			return "Paper";
		case SCISSORS:
			return "Scissors";
		case ROCK:
			return "Rock";
		default:
			throw new IllegalArgumentException();
		}
	}

	public static Roshambo randRoshambo() {
		Random rand = new Random();
		int randIndex = rand.nextInt(3);
		Roshambo[] roshamboArray = Roshambo.values();
		return roshamboArray[randIndex];
	}
}
