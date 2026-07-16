package com.joakim.javaportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaPortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaPortfolioApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 10) + 1;

        System.out.println("Welcome to guess the number game!");
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Can you guess what it is?");
        System.out.println("Please input a number between 1 and 10:"); 

        int userGuess = scanner.nextInt();

        if (userGuess !=  || userGuess != 1-10) {
            System.out.println("Please input a valid number");
        } else if (userGuess != randomNumber) {
            System.out.println("Wrong.. better luck next time");
        } else if (userGuess == randomNumber) {
            System.out.println("Correct!");
        }

        System.out.println("Thanks for playing!");
    }
}
