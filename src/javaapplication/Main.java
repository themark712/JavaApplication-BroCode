package javaapplication;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // if statement = performs a block of code if its condition is true
    Scanner scanner = new Scanner(System.in);

    String name;
    int age;
    boolean isFan;
    
    System.out.print("What is your name?: ");
    name = scanner.nextLine();

    System.out.print("What is your age?: ");
    age = scanner.nextInt();

    System.out.print("Are you a Hilltopper fan?: ");
    isFan = scanner.nextBoolean();

    // group 1
    if(name.isEmpty()) {
      System.out.println("You didn't enter your name!");
    } else {
      System.out.println("Hello, " + name + "!");
    }
    
    // group 2
    if (age >= 65) {
      System.out.println("You are a senior!");
    }
    else if (age >= 18) {
      System.out.println("You are an adult!");
    }
    else if (age < 0) {
      System.out.println("You haven't been born yet!");
    }
    else if (age == 0) {
      System.out.println("You are a baby!");
    }
    else {
      System.out.println("You are a child!");
    }
    
    // group 3
    if(isFan) {
      System.out.println("You are a fan!");
    } else {
      System.out.println("Boooooo!");
    }

    scanner.close();
  }

}
