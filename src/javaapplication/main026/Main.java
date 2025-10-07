/*
  Java methods
  includes video 27, overloaded methods
 */
package javaapplication.main026;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // method : a reusable block of code that is executed when called
    //          and performs a specific task
    //          myMethod();

    Scanner scanner = new Scanner(System.in);
    String name = "Mark";
    int age = 51;

    happyBirthday(name, age);
    
    System.out.println("The square is " + square(3.14));
    System.out.println("The cube is " + cube(3.14));
    System.out.println("Full name: " + getFullName(name, "Johnson"));
    System.out.println("Full name: " + getFullName("Homer", "Simpson"));
    
    age = 21;
    if(ageCheck(age)) {
      System.out.println("You may sign up");
    } else {
      System.out.println("You must be over 18");
    }
    
    // overloaded methods : methods with the same name, but with different signatures
    //                    : signature - a method name + its parameters
    //  overloaded methods MUST have different signatures (parameter list types)
    
    System.out.println(add(3,4));
    System.out.println(add(19,17.3592, 28.32478));
    
    String pizza = bakePizza("flat bread");
    System.out.println(pizza);
    
    pizza = bakePizza("NY style", "mozzarella");
    System.out.println(pizza);
    
    pizza = bakePizza("pan", "mozzarella", "sausage");
    System.out.println(pizza);
    
    scanner.close();
  }
  
  static void happyBirthday(String name, int age) {
    System.out.println("Happy birthday to you!");
    System.out.println("Happy birthday dear " + name + "!");
    System.out.println("You are " + age + " years old!");
    System.out.println("Happy birthday to you!\n");
  }
  
  static double square(double number) {
    return number * number;
  }
  
  static double cube(double number) {
    return number * number * number;
  }
  
  static String getFullName(String first, String last) {
    return first + " " + last;
  }
  
  static boolean ageCheck(int age) {
    if(age >= 18) {
      return true;
    } else {
      return false;
    }
  }

  // overloaded method (add())
  static double add(double a, double b) {
    return a + b;
  }
  
  static double add(double a, double b, double c) {
    return a + b;
  }
  
  // overloaded method (bakePizza())
  static String bakePizza(String bread) {
      return bread + " pizza";
  }
  
  static String bakePizza(String bread, String cheese) {
      return cheese + " " + bread + " pizza";
  }
  
  static String bakePizza(String bread, String cheese, String topping) {
      return topping + " " + cheese + " " + bread + " pizza";
  }
}
