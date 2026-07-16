package com.joakim.javaportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaPortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaPortfolioApplication.class, args);

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Welcome to guess the number game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
    }

}
