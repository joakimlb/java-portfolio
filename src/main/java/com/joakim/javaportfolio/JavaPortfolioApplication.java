package com.joakim.javaportfolio;

import java.util.Scanner;

public class JavaPortfolioApplication {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Generate a random number between 1 and 10
        int randomNumber = (int) (Math.random() * 10) + 1;

        // Game introduction
        System.out.println("Welcome to guess the number game!");
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Can you guess what it is?");
        System.out.println("Please input a number between 1 and 10:"); 

        // Loop to allow the user to guess until they input a valid number
        while (scanner.hasNextInt()) 
        try {
            int userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Please input a number between 1 and 10.");
            } else if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            } else {
                System.out.println("Sorry, that is not correct..");
                System.out.println("Try again! Please input a number between 1 and 10:");
            } 
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear the invalid input
        }

        // Close the scanner and end the game
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
