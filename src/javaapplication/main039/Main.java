/*
  Object Oriented Programming
*/
package javaapplication.main039;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Car car = new Car();
    
    System.out.println(car.year);
    System.out.println(car.color);
    System.out.println(car.make);
    System.out.println(car.model);
    System.out.println(car.price);
    
    car.start();
    System.out.println(car.isRunning);
    
    car.stop();
    System.out.println(car.isRunning);
  }
}
