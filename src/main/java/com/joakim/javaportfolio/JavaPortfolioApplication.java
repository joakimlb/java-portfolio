package com.joakim.javaportfolio;

import java.util.Scanner;

public class JavaPortfolioApplication {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 10) + 1;

        System.out.println("Welcome to guess the number game!");
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Can you guess what it is?");
        System.out.println("Please input a number between 1 and 10:"); 

        if (scanner.hasNextInt()) {
            int userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Please input a number between 1 and 10.");
            } else if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            } else {
                System.out.println("Sorry, the correct number was: " + randomNumber);
            } 
        } else {
                System.out.println("Invalid input. Please enter a valid number.");
            }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
