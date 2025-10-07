/*
  2-dimensional arrays
 */
package javaapplication.main035;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // 2-dimensional array : an array where each element in an array
    //                       Useful for storing a matrix of data
    //                       {
    //                         { a, b, c, d},
    //                         { e, f, g, h},
    //                         { i, j, k, l}
    //                       }

    Scanner scanner = new Scanner(System.in);

    String[] fruits = {"apple", "orange", "banana"};
    String[] vegetables = {"potato", "onion", "carrot"};
    String[] meats = {"beef", "pork", "chicken"};
    
    // 2D array
    String[][] groceries = {{"orange", "lemon", "lime"}, vegetables, meats};
    
    for (String[] foods : groceries) {
      for(String food : foods) {
        System.out.print(food + " ");
      }
      System.out.println("");
    }
    
    // accessing individual items
    System.out.println(groceries[1][0]);
    
    // replace an item
    groceries[1][2] = "radish";
    groceries[2][1] = "eggs";
    
    for (String[] foods : groceries) {
      for(String food : foods) {
        System.out.print(food + " ");
      }
      System.out.println("");
    }
    
    // Project : Telephone number pad
    char[][] telephone = {
      {'1', '2', '3'},
      {'4', '5', '6'},
      {'7', '8', '9'},
      {'*', '0', '#'}
    };
    
    for (char[] row : telephone) {
      for(char number : row) {
        System.out.print(number + "  ");
      }
      System.out.println("");
    }
    
    scanner.close();
  }
}
