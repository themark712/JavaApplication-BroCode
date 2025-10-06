package javaapplication.main011;

import java.util.Scanner;

public class Main011 {

  public static void main(String[] args) {
    // Project: Compound Interest Calculator

    Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int timesCompounded;
    int years;
    double amount;

    System.out.print("Enter the pricipal amount: ");
    principal = scanner.nextDouble();

    System.out.print("Enter the interest rate (%): ");
    rate = scanner.nextDouble() / 100;

    System.out.print("Enter the number of times compounded: ");
    timesCompounded = scanner.nextInt();

    System.out.print("Enter the number of years: ");
    years = scanner.nextInt();

    amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

    System.out.printf("The amount after %d years is : $%.2f\n", years, amount);
    scanner.close();
  }

}
