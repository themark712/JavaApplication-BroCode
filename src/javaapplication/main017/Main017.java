package javaapplication.main017;

import java.util.Scanner;

public class Main017 {

  public static void main(String[] args) {
    // Project: Temperature Converter

    Scanner scanner = new Scanner(System.in);

    double temp;
    double newTemp;
    String unit;

    System.out.println("Temperature Converter");
    System.out.println("");
    System.out.print("Enter the temperature: ");

    temp = scanner.nextDouble();

    System.out.print("Convert to Celsius or Fahreheit? (C or F): ");
    unit = scanner.next().toUpperCase();

    if (unit.equals("F") || unit.equals("C")) {
      newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
      System.out.println(temp);
      System.out.println(unit);
      System.out.printf("%.2f\n", newTemp);
    }
    else {
      System.out.println("Invalid selection");
    }

    scanner.close();
  }

}
