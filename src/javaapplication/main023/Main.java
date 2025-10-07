/*
  for loops
  includes video #24, breaking out of loops
 */
package javaapplication.main023;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // for loop : execute some code a specified number of times
    // breaking out of loops :
    //   break    : break out of a loop (STOP)
    //   continue : skip current iteration of a loop (SKIP)
    Scanner scanner = new Scanner(System.in);

    // basic for loop
    for (int i = 0; i < 10; i++) {
      System.out.println("WKU!");
      // breaking out of a loop
      if(i==5) {
        System.out.println("Five is enough");
        break;
      }
    }

    // changing increment value
    for (int i = 0; i < 10; i += 2) {
      System.out.println(i);
    }

    // decrementing counter, skip and continue on odd numbers
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
      if(i % 2 == 1) {
        continue;
      }
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
