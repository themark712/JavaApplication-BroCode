/*
  Arrays - combines with video 32
  Arrays with user input
 */
package javaapplication.main031;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // array : a collection of values of the same data type
    //         Think of it as a variable that can store more than 1 value

    Scanner scanner = new Scanner(System.in);

    String[] fruits = {"apple", "orange", "cherry", "lemon", "lime"};
    //System.out.println(fruits);  // this will output a memory address
    System.out.println(fruits[2]);
    // System.out.println(fruits[10]); // error: element 10 does not exist

    // change an element
    fruits[3] = "mango";
    System.out.println(fruits[3]);

    // array properties
    int numberOfFruits = fruits.length;
    System.out.println(numberOfFruits);

    // printing all array elements
    for (int i = 0; i < fruits.length; i++) {
      System.out.print(fruits[i] + " ");
    }
    System.out.println("");

    // enhanced array loop
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    // Arrays class
    // Arrays.sort() : sorts array items alphabetically
    Arrays.sort(fruits);

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    // Arrays.fill(array, value) : fills each array element with specified value 
    String[] fruitGrapes = fruits;
    Arrays.fill(fruitGrapes, "grape");

    for (String fruit : fruitGrapes) {
      System.out.println(fruit);
    }

    // empty array, providing space for 4 elements
    String[] foods = new String[4];
    foods[0] = "taco";
    foods[1] = "steak";
    foods[2] = "pizza";
    foods[3] = "hamburger";
    //foods[4] = "lobster";  // error: there is only space for 4 elements

    for (String food : foods) {
      System.out.println(food);
    }

    // user input, with dynamic size
    int size;
    String[] teams;
    
    System.out.print("How many teams do you want?: ");
    size = scanner.nextInt();
    // clear the input buffer after .nextInt()
    scanner.nextLine();
    
    // assign array size
    teams = new String[size];
    
    for (int i = 0; i < teams.length; i++) {
      System.out.print("Enter a team name: ");
      teams[i] = scanner.nextLine();
    }
    for (String team : teams) {
      System.out.println(team);
    }

    scanner.close();
  }

}
