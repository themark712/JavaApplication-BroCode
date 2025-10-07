/*
  for loops
 */
package javaapplication.main023;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // for loop : execute some code a specified number of times

    Scanner scanner = new Scanner(System.in);

    // basic for loop
    for (int i = 0; i < 10; i++) {
      System.out.println("WKU!");
    }

    // changing increment value
    for (int i = 0; i < 10; i += 2) {
      System.out.println(i);
    }

    // decrementing counter
    for (int i = 10; i > 0; i -= 2) {
      System.out.println(i);
    }

    // accepting user input
    // countdown simulation
    
    System.out.print("How many seconds do we countdown from?: ");
    int start = scanner.nextInt();

    for (int i = start; i > 0; i--) {
      System.out.println(i);
      Thread.sleep(1000);
    }

    System.out.println("Happy New Year");

    scanner.close();
  }

}
