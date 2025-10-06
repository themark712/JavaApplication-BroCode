package javaapplication.main006;

import java.util.Scanner;

public class Main006 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    double total;
    char currency = '$';
    
    System.out.print("What item would you like to buy?: ");
    item = scanner.nextLine();
    
    System.out.print("What is the price per each?: ");
    price = scanner.nextDouble();
    
    System.out.print("How many would you like to buy?: ");
    quantity = scanner.nextInt();
    
    total = price * quantity;
    
    System.out.println("\nYou are buying " + quantity + " " + item + "(s).");
    System.out.println("Your total is " + currency + total);
    
    scanner.close();
  }
}
