/*
  Inheritance
 */
package javaapplication.main044;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Inheritance : one class inherits the attribute and methods from another class
    //          Child <-- Parent <-- Grandparent

    Dog dog = new Dog();
    Cat cat = new Cat();
    Plant plant = new Plant();

    System.out.println(dog.isAlive);
    System.out.println(dog.lives);
    dog.speak();
    dog.eat();

    System.out.println(cat.isAlive);
    System.out.println(cat.lives);
    cat.speak();
    cat.eat();
    
    System.out.println(plant.isAlive);
    plant.photosynthesize();
  }
}
