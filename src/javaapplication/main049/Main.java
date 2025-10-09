/*
  Interfaces
 */
package javaapplication.main049;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Interface : A blueprint for a class that specfies a set of abstract methods
    //             that implementing classes MUST define
    //             Supports multiple inheritance-like behaviors
    
    Rabbit rabbit = new Rabbit();
    rabbit.flee();
    
    Hawk hawk = new Hawk();
    hawk.hunt();
    
    Fish fish = new Fish();
    fish.flee();
    fish.hunt();
  }
}
