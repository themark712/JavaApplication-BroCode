package javaapplication.main040;

public class Student {
  String name;
  int age;
  double gpa;
  boolean isEnrolled;

  // constuctor
  Student(String name, int age, double gpa) {
    // this keyword refers to the CURRENT object
    this.name = name;
    this.age = age;
    this.gpa = gpa;
    this.isEnrolled = true;
  }
  
  void study() {
    System.out.println(this.name + " is studying");
  }
}
