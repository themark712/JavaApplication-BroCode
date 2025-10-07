/*
  Logical operators
 */
package javaapplication.main020;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Logical operators : allows checking or modifying more than one condition
    // && : AND  : ALL condition in expression must be true
    // || : OR   : true is ANY condition in expression is true
    // !  : NOT  : reverses the result of a condition

    Scanner scanner = new Scanner(System.in);
    double temp = 90;   // Fahrenheit
    boolean isSunny = true;

    if (temp <= 80 && temp >= 40 && isSunny) {
      System.out.println("The weather is good");
      System.out.println("It is sunny outside");
    }
    else if (temp <= 80 && temp >= 40 && !isSunny) {
      System.out.println("The weather is good");
      System.out.println("It is cloudy outside");
    }
    else if (temp > 80 || temp < 40) {
      System.out.println("The weather is bad");
    }

    // Username validator
    // Rules:
    //   between 4-12 characters
    //   cannot contain spaces or underscores
    String username;

    System.out.print("Enter a new username: ");
    username = scanner.nextLine();

    if (username.length() < 4 || username.length() > 12) {
      System.out.println("Username must be between 4 and 12 characters!");
    }
    else if (username.contains(" ") || username.contains("_")) {
      System.out.println("Username cannot contain spaces or underscores!");
    } else {
      System.out.println("Your new username is: " + username);
    }

    scanner.close();
  }

}
