package javaapplication.main029;

import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws InterruptedException {
    // Project : Simple Bank Program
    // declare variables
    // display menu
    // get and process user's choice
    // methods:
    //   showBalance()
    //   deposit()
    //   withdraw()
    // exit message

    double balance = 0;
    boolean isRunning = true;
    int choice;

    System.out.println("******************************* ");
    System.out.println(" BANKING PROGRAM ");
    System.out.println("******************************* ");

    while (isRunning) {

      System.out.println("Select an option: ");
      System.out.println("1 - Show Balance");
      System.out.println("2 - Deposit Funds");
      System.out.println("3 - Withdraw");
      System.out.println("4 - Exit");
      System.out.println("******************************* ");

      System.out.print("Enter your choice (1-4): ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1 ->
          showBalance(balance);
        case 2 ->
          balance += deposit();
        case 3 ->
          balance -= withdraw(balance);
        case 4 ->
          isRunning = false;
        default ->
          System.out.println("Invalid option");
      }
    }

    System.out.println("******************************* ");
    System.out.println("Goodbye!");
    System.out.println("******************************* ");

    scanner.close();
  }

  static void showBalance(double balance) {
    System.out.printf("Your current balance is %.2f\n\n", balance);
  }

  static double deposit() {
    double amount;
    System.out.print("Enter amount for deposit: ");
    amount = scanner.nextDouble();

    // varify amount
    if (amount <= 0) {
      System.out.println("Amount must be greater than $0\n");
      return 0;
    }
    else {
      return amount;
    }
  }

  static double withdraw(double balance) {
    double amount;
    System.out.print("Enter amount for withdrawl: ");
    amount = scanner.nextDouble();

    // varify amount
    if (amount <= 0) {
      System.out.println("Amount must be greater than $0\n");
      return 0;
    }
    else if (amount > balance) {
      System.out.println("Insufficient funds\n".toUpperCase());
      return 0;
    }
    else {
      return amount;
    }
  }
}
