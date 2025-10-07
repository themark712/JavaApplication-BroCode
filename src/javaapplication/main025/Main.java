/*
  nested loops
 */
package javaapplication.main025;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // nested loop : a loop inside another loop
    //  often used with matrice or data structures & algorithms

    Scanner scanner = new Scanner(System.in);

    for (int x = 1; x <= 3; x++) {
      for (int i = 1; i <= 9; i++) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }

    int rows;
    int columns;
    char symbol;

    // Exercise: 
    System.out.print("Enter the number of rows: ");
    rows = scanner.nextInt();

    System.out.print("Enter the number of columns: ");
    columns = scanner.nextInt();

    System.out.print("Enter the symbol to use: ");
    symbol = scanner.next().charAt(0);

    // outer loop (rows)
    for (int i = 1; i <= rows; i++) {
      // inner loop (columns)
      for (int j = 1; j <= columns; j++) {
        System.out.print(symbol + " ");
      }
      System.out.println("");
    }
    
    scanner.close();
  }

}
