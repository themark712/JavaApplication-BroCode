package javaapplication.main042;

public class Car {
  String make = "Chevrolet";
  String model = "Corvette";
  String color = "red";
  int year = 1968;
  double price = 62000.0;
  boolean isRunning = false;
  
  Car(String make, String model, String color) {
    this.make = make;
    this.model = model;
    this.color = color;
  }
  
  void drive() {
    System.out.println("You are driving the " + this.color + " " + this.model);
  }
}
