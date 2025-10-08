/*
  Arrays of objects
*/
package javaapplication.main042;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Car car1 = new Car("Chevrolet", "Corvette", "red");
    Car car2 = new Car("Lincoln", "Navigator", "powder blue");
    Car car3 = new Car("Ford", "F-150", "navy blue");
    
    // array
    Car[] cars = {car1, car2, car3};
    
    // standar for
    for (int i = 0; i < cars.length; i++) {
      cars[i].drive();
    }
    
    System.out.println("");
    
// enhanced for
    for(Car car : cars) {
      car.drive();
    }

    System.out.println("");
    
    // populating array by passing anonymous objects (no identifer (i.e., variable) for objects
    Car[] cars2 = {new Car("Cadillac", "Escalade", "black"),
                  new Car("GMC", "Hummer", "gray"),
                  new Car("Jeff", "Wrangler", "forest green")};
    
    for(Car car : cars2) {
      car.color = "yellow";
      car.drive();
    }
    
    System.out.println("");
  }
}
