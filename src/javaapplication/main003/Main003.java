/*
  accepting user input
*/
package javaapplication.main003;

import java.util.Scanner;

public class Main003 {
  public static void main(String[] args) {
    // create scanner object
    Scanner scanner = new Scanner(System.in);
    
    /*
    // create prompt for user input
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    
    // create prompt that accepts integer
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    
    // creating a string AFTER creating an integer (input new line character must be removed from buffer)
    scanner.nextLine();
    System.out.print("Enter your major: ");
    String major = scanner.nextLine();
    
    // create prompt that accepts a double
    System.out.print("Enter your GPA: ");
    double gpa = scanner.nextDouble();
    
    // create prompt that accepts a boolean
    System.out.print("Are you a student? (true/false)");
    boolean isStudent = scanner.nextBoolean();
    
    System.out.println("Hello, " + name);
    System.out.println("You are " + age + " years old");
    System.out.println("Your major is " + major);
    System.out.println("Your GPA is " + gpa);
    
    if(isStudent) {
      System.out.println("You are a student");
    } else {
      System.out.println("You are not a student");
    }
    */
    
    // convert miles to kilometers
    double miles = 0.0;
    double kilometers = 0.0;
    
    System.out.println("MILES TO KILOMETERS");
    System.out.print("Enter the number of miles: ");
    miles = scanner.nextDouble();
    kilometers = miles * 1.609344;
    System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
    
    // close scanner object
    scanner.close();
  }  
}
