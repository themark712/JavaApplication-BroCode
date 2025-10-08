/*
  toString() method
 */
package javaapplication.main047;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // .toString() : Method inherited from the Java Object class
    //               Used to return a string representation of an object
    //               By default, it returns a hash code as a unique identifier
    //               It can be overridden to provide meaningful details
    
    Car car1 = new Car("Chevrolet", "Corvette", 1968, "red");
    System.out.println(car1);
    
    Car car2 = new Car("Lincoln", "Navigator", 2025, "powder blue");
    System.out.println(car2);
  }
}
