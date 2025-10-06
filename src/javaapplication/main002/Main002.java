package javaapplication.main002;

public class Main002 {

  public static void main002(String[] args) {
    // this is the first program of the tutorial
    /*
    I am learning from:
    Bro Code
     */
    System.out.println("I like my homemade subs");
    System.out.println("They are better than delis");
    System.out.print("Buy me a sub...\n");
    System.out.print("Nevermind, I'll make one!\n");
    
    // variable = a reusable container for a value
    //            a variable behaves as if it was the value it contains
    // Variable Types
    // Primitive = simple value stored directly in memory (stack)
    // Reference = memory address (stack) that points to the (heap)
    // Primitive    Reference
    // ----------   ----------
    // int          string
    // double       array
    // char         object
    // boolean
    // 2 steps to creating a variable
    // -------------------------------
    // 1. declaration
    // 2. assignment
    // int
    int age;    // declaration
    age = 21;   // assignment

    int year = 2025;   // declaration and assignment

    System.out.println(age);
    System.out.println(year);
    System.out.println("The year is " + year);   // concatenation

    // double
    double price = 19.99;
    double gpa = 3.8;
    double temperature = -12.5;

    System.out.println("price: $" + price);

    // char
    char grade = 'A';
    char symbol = '!';
    char currency = '$';

    System.out.println(grade);
    System.out.println(symbol);
    System.out.println(currency);

    // boolean 
    boolean isStudent = true;
    boolean wonGame = false;

    System.out.println(isStudent);
    System.out.println(wonGame);

    if (wonGame) {
      System.out.println("You won!");
    }
    else {
      System.out.println("You lost :(");
    }
    
    // Strings
    String name = "Mark Johnson";
    String favoriteTeam = "Western Kentucky";
    System.out.println("My name is " + name + " and my favorite team is " + favoriteTeam);
  }

}
