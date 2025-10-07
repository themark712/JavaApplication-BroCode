/*
  varargs
 */
package javaapplication.main034;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // varargs : allow a method to accept a varying number of arguments
    //           makes methods more flexible, no need for overloaded methods
    //           java will pack the arguments into an array
    //           static [void|type] myMethod([type]... arrayName) {}

    Scanner scanner = new Scanner(System.in);

    System.out.println(add(1, 3));
    System.out.println(add(1, 3, 9));
    System.out.println(add(1.01, 3.8, 9.9888, 3.14));

    System.out.println(average(1, 3));
    System.out.println(average(1, 3, 9));
    System.out.println(average(25, 26, 27, 28));
    System.out.println(average(164.01, 3.8, 9.9888, 3.14));
    System.out.println(average());

    scanner.close();
  }

  static double add(double... numbers) {
    double sum = 0;

    for (double number : numbers) {
      sum += number;
    }

    return sum;
  }

  static double average(double... numbers) {
    double average = 0.0;
    double sum = 0.0;

    if (numbers.length == 0) {
      return 0;
    }
      for (double number : numbers) {
        sum += number;
      }

    return sum / numbers.length;
  }
}
