/*
  Class constructors
*/
package javaapplication.main040;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // constructor : a special method to initial objects
    //               You can pass arguments to a constructor and set up initial values
    
    Student student1 = new Student("Homer Simpson", 40, 2.2);
    Student student2 = new Student("Bugs Bunny", 12, 4.0);
    Student student3 = new Student("Wile E. Coyote", 14, 1.0);
    
    System.out.println(student1.name);
    System.out.println(student1.age);
    System.out.println(student1.gpa);
    System.out.println(student1.isEnrolled);
    student1.study();
    
    System.out.println(student2.name);
    System.out.println(student2.age);
    System.out.println(student2.gpa);
    System.out.println(student2.isEnrolled);
    student2.study();
    
    System.out.println(student3.name);
    System.out.println(student3.age);
    System.out.println(student3.gpa);
    System.out.println(student3.isEnrolled);
    student3.study();
  }
}
