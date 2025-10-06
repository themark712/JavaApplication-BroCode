/*
  random numbers
 */
package javaapplication.main008;

import java.util.Random;

public class Main008 {

  public static void main(String[] args) {
    // generate random number
    // declare random class helper
    Random random = new Random();

    int number;

    for (int i = 1; i <= 100; i++) {
      // get the random number (between 1 and 6)
      number = random.nextInt(1, 7);
      System.out.println(number);
    }
  }
}
