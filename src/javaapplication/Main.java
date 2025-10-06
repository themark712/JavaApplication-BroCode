/*
  ternary operator
 */
package javaapplication;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // ternary operator ? : return 1 of 2 values based on shorthand condition
    //   variable = (condition) ? ifTrue : ifFalse

    Scanner scanner = new Scanner(System.in);

    int score = 70;

    String result = (score >= 65) ? "PASS" : "FAIL";

    System.out.println("Your score is " + score);
    System.out.println("You " + result);
    
    int number = 356;
    
    String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
    System.out.println("The number is " + evenOrOdd);
    
    int hours = 13; // 1:00 pm
    
    String timeOfDay = (hours < 12) ? "AM" : "PM";
    System.out.println("The time of day is " + timeOfDay);
    
    double income = 60_000.48;
    double taxRate = (income >= 40000) ? 0.25 : 0.15;
    System.out.println("Your income is " + income);
    System.out.println("Your tax rate is " + taxRate);
    
    scanner.close();
  }

}
