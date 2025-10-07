/*
  While loop
 */
package javaapplication.main021;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // while loop : repeat some code while some condition remains true

    Scanner scanner = new Scanner(System.in);

    String name = "";

    while (name.isEmpty()) {
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    }

    System.out.println("Hello, " + name);

    // simple game demo
    String response = "";

    while (!response.equals("Q")) {
      System.out.println("You are playing a game");
      System.out.print("Press Q to quit: ");
      response = scanner.next().toUpperCase();
    }

    System.out.println("You have quit the game.");

    // age example
    int age = 0;
    System.out.print("Enter your age: ");
    age = scanner.nextInt();

    while (age < 0) {
      System.out.println("Your age cannot be negative");
      System.out.print("Enter your age: ");
      age = scanner.nextInt();
    }

    System.out.println("You are " + age + " years old");

    // do ... while loop
    String favorite = "Heat";

    do {
      System.out.print("What is your favorite team? ");
      favorite = scanner.nextLine();
    } while (!favorite.equals("Heat") && !favorite.equals("Hilltoppers"));

    System.out.println("Nice! You are a " + favorite + " fan!");

    // number input example
    int number = 0;
    
    while (number < 1 || number > 10) {
      System.out.print("Enter a number between 1 and 10: ");
      number = scanner.nextInt();
    }
    
    System.out.println("You picked: " + number);
    
    scanner.close();
  }

}
