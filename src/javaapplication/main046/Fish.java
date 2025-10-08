package javaapplication.main046;

public class Fish extends Animal {
  
  @Override     // annotation that marks an overrided method, can detect method spelling and signature errors
  void move() {
    System.out.println("This animal is swimming");
  }
}
