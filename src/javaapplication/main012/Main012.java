/*
  nested if() statements
 */
package javaapplication.main012;

import java.util.Scanner;

public class Main012 {

  public static void main(String[] args) {
    boolean isStudent = true;
    boolean isSenior = true;
    double price = 9.99;

    if (isStudent) {
      if (isSenior) {
        System.out.println("You get a senior discount of 20%");
        price *= 0.8;
      }
      System.out.println("You get a student discount of 10%");
      price *= 0.9;
    }
    else {
      if (isSenior) {
        System.out.println("You get a senior discount of 20%");
        price *= 0.8;
      }
    }

    System.out.printf("The price of your ticket is: $%.2f\n", price);
  }

}
