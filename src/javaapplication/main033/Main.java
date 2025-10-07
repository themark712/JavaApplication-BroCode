/*
  Searching arrays
 */
package javaapplication.main033;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = {100, 73, 4623, 4};
    String[] cars = {"Escalade", "Navigator", "Corvette", "QX80"};
    
    int numTarget;
    String carTarget;
    boolean isFound = false;
    
    System.out.print("Enter a number to find: ");
    numTarget = scanner.nextInt();
    scanner.nextLine();
    
    // linear search, loop through array
    for (int i = 0; i < numbers.length; i++) {
      if(numTarget == numbers[i]) {
        System.out.println("Number found at index: " + i);
        isFound = true;
        break;
      }
    }
    
    if(!isFound) {
      System.out.println("Number element was not found");
    }
    
    System.out.print("Enter a car to find: ");
    carTarget = scanner.nextLine();
    
    isFound = false;
    for (int i = 0; i < cars.length; i++) {
      if(cars[i].equals(carTarget)) {
        System.out.println("Car found at index: " + i);
        isFound = true;
        break;
      }
    }
    
    if(!isFound) {
      System.out.println("Car element was not found");
    }

    scanner.close();
  }

}
