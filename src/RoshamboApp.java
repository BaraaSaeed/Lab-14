import java.util.Scanner;

/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String playAgain = "y";
		int userWins = 0;
		int userLosses = 0;
		int TheJetsWins = 0;
		int TheJetsLosses = 0;
		int TheSharksLosses = 0;
		int TheSharksWins = 0;
		System.out.println("Welcome to Rock Paper Scissors\n");
		System.out.println("Enter you name: ");
		String userName = scnr.nextLine();
		RockPlayer TheJets = new RockPlayer("TheJets");
		RandPlayer TheSharks = new RandPlayer("TheSharks");
		ConsolePlayer Theuser = new ConsolePlayer(userName);
		do {
			String userOpponentInput = Validator.getString(scnr,
					"Would you like to play against " + TheJets.getName() + " or " + TheSharks.getName() + "(j/s)?:");
			String userRoleInput = Theuser.generateRoshambo().toString();
			String jetInput = TheJets.generateRoshambo().toString();
			String sharkInput = TheSharks.generateRoshambo().toString();

			if (userOpponentInput.substring(0, 1).equalsIgnoreCase("j")) {
				System.out.println(Theuser.getName() + ": " + userRoleInput);
				System.out.println(TheJets.getName() + ": " + jetInput);
				if (userRoleInput.equalsIgnoreCase("Paper")) {
					System.out.println(Theuser.getName() + " wins!");
					userWins++;
					TheJetsLosses++;
				} else if (userRoleInput.equalsIgnoreCase(jetInput)) {
					System.out.println(" Draw!");
				} else if (userRoleInput.equalsIgnoreCase("Scissors")) {
					System.out.println(TheJets.getName() + " wins!");
					TheJetsWins++;
					userLosses++;
				}

			} else if (userOpponentInput.substring(0, 1).equalsIgnoreCase("s")) {
				System.out.println(Theuser.getName() + ": " + userRoleInput);
				System.out.println(TheJets.getName() + ": " + sharkInput);
				if (userRoleInput.equalsIgnoreCase("Paper") && sharkInput.equalsIgnoreCase("Rock")) {
					System.out.println(Theuser.getName() + " wins!");
					userWins++;
					TheSharksLosses++;
				} else if (userRoleInput.equalsIgnoreCase("Rock") && sharkInput.equalsIgnoreCase("Scissors")) {
					System.out.println(Theuser.getName() + " wins!");
					userWins++;
					TheSharksLosses++;
				} else if (userRoleInput.equalsIgnoreCase(sharkInput)) {
					System.out.println(" Draw!");
				} else if (userRoleInput.equalsIgnoreCase("Scissors") && sharkInput.equalsIgnoreCase("Paper")) {
					System.out.println(TheSharks.getName() + " wins!");
					TheSharksWins++;
					userLosses++;
				} else if (sharkInput.equalsIgnoreCase("Paper") && userRoleInput.equalsIgnoreCase("Rock")) {
					System.out.println(Theuser.getName() + " wins!");
					userWins++;
					TheSharksLosses++;
				} else if (sharkInput.equalsIgnoreCase("Rock") && userRoleInput.equalsIgnoreCase("Scissors")) {
					System.out.println(TheSharks.getName() + " wins!");
					TheSharksWins++;
					userLosses++;
				} else if (sharkInput.equalsIgnoreCase("Scissors") && userRoleInput.equalsIgnoreCase("Paper")) {
					System.out.println(TheSharks.getName() + " wins!");
					TheSharksWins++;
					userLosses++;
				}
			}
			System.out.println("Play again?(y/n)");
			playAgain = scnr.nextLine();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Total wins and losses:");
		System.out.println(userName + " Wins: " + userWins);
		System.out.println(userName + " Wins: " + userLosses);
		System.out.println(TheJets.getName() + " Wins: " + TheJetsWins);
		System.out.println(TheJets.getName() + " Losses: " + TheJetsLosses);
		System.out.println(TheSharks.getName() + " Wins: " + TheSharksWins);
		System.out.println(TheSharks.getName() + " Losses: " + TheSharksLosses);

	}

}
