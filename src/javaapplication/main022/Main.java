package javaapplication.main022;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Project : Number Guessing Game

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int guess;
    int attempts = 0;
    int min = 1;
    int max = 100;

    int randomNumber = random.nextInt(min, max + 1); // random number between 1 and 100

    System.out.println("Number Guessing Game");
    System.out.printf("Guess a number between %d-%d.\n", min, max);

    do {
      System.out.print("Enter your guess: ");
      guess = scanner.nextInt();
      if (guess < randomNumber) {
        System.out.println("Too low!");
      }
      else if (guess > randomNumber) {
        System.out.println("Too high!");
      }
      else {
        System.out.println("CORRECT!");
      }
      attempts++;
    } while (guess != randomNumber);

    System.out.println("The number was " + randomNumber + ". You took " + attempts + " tries.");
    scanner.close();
  }

}
