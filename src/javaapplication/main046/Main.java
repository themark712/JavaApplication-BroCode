/*
  Method overriding
 */
package javaapplication.main046;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Method overriding : when a subclass provides its own implementation
    //                     of a method that is defined in a superclass/parent
    //                     Allow code reusability and gives specific implementations

    Dog dog = new Dog();
    Cat cat = new Cat();
    Fish fish = new Fish();

    dog.move();
    cat.move();
    fish.move();
  }
}
