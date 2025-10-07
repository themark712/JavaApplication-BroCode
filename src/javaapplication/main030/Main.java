package javaapplication.main030;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Project : Dice Rolling Program
    // declare variables
    // get number of dice from user
    // check if number of dice > 0
    // roll all the dice
    // get the total
    // display ascii of dice

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numberOfDice;
    int total = 0;

    System.out.println("Dice Rolling Program\n");

    System.out.print("Enter the number of dice to roll: ");
    numberOfDice = scanner.nextInt();

    if (numberOfDice > 0) {
      for (int i = 0; i < numberOfDice; i++) {
        int roll = random.nextInt(1, 7);
        printDie(roll);
        total += roll;
        System.out.println("You rolled a " + roll);
      }
      System.out.println("The total is " + total);
    }
    else {
      System.out.println("Number of dice must be greater than 0");
    }

    scanner.close();
  }
  
  // function to show ascii representation of the roll
  static void printDie(int roll) {
    String dice1 = """
                    -------
                   |       |
                   |   @   |
                   |       |
                    -------
                   """;
    
    String dice2 = """
                    -------
                   | @     |
                   |       |
                   |     @ |
                    -------
                   """;
    
    String dice3 = """
                    -------
                   | @     |
                   |   @   |
                   |     @ |
                    -------
                   """;
    
    String dice4 = """
                    -------
                   | @   @ |
                   |       |
                   | @   @ |
                    -------
                   """;
    
    String dice5 = """
                    -------
                   | @   @ |
                   |   @   |
                   | @   @ |
                    -------
                   """;
    
    String dice6 = """
                    -------
                   | @   @ |
                   | @   @ |
                   | @   @ |
                    -------
                   """;
    
    switch(roll) {
      case 1 -> System.out.println(dice1);
      case 2 -> System.out.println(dice2);
      case 3 -> System.out.println(dice3);
      case 4 -> System.out.println(dice4);
      case 5 -> System.out.println(dice5);
      case 6 -> System.out.println(dice6);
      default -> System.out.println("Invalid roll");
    }
  }
}
