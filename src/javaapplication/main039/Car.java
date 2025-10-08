package javaapplication.main039;

public class Car {
  String make = "Chevrolet";
  String model = "Corvette";
  String color = "red";
  int year = 1968;
  double price = 62000.0;
  boolean isRunning = false;
  
  void start() {
    isRunning = true;
    System.out.println("The engine has been started");
  }
  
  void stop() {
    isRunning = false;
    System.out.println("The engine has been stopped");
  }
  
  void drive() {
    System.out.println("You are driving the " + model);
  }
  
  void brake() {
    System.out.println("You have hit the " + model + "'s brakes");
  }
}
