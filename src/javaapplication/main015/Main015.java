/*
  String .substring() function
 */
package javaapplication.main015;

import java.util.Scanner;

public class Main015 {

  public static void main(String[] args) {
    // Project: Weight Conversion Program
    
    // declare variables
    Scanner scanner = new Scanner(System.in);
    int option;
    double pounds;
    double kilograms;
    
    // welcome message
    System.out.println("Welcome to Unit Conversion");
    System.out.println("");
    
    // prompt for user choice:
    //   option 1: convert lbs to kgs
    //   option 2: convert kgs to lbs
    //   else: not a valid choice
    System.out.println("Select an option: ");
    System.out.println("1: Convert pounds to kilograms");
    System.out.println("2: Convert kilograms to pounds");
    
    option = scanner.nextInt();
    
    if(option == 1) {
      System.out.println("Enter the weight in pounds: ");
      pounds = scanner.nextDouble();
      kilograms = pounds * 0.453592;
      System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
    } else if(option == 2) {
      System.out.println("Enter the weight in kilograms: ");
      kilograms = scanner.nextDouble();
      pounds = kilograms * 2.20462;
      System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds");
    } else {
      System.out.println("Not a valid option");
    }
    
    scanner.close();
  }

}
