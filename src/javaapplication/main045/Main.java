/*
  Super keyword
 */
package javaapplication.main045;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // super : refers to the parent class (subclass <-- superclass)
    //         Used in constructors and method overriding
    //         Calls the parent constructor to initialize attributes

    Person person = new Person("Homer", "Simpson");
    person.showName();
    
    Student student = new Student("Bugs", "Bunny", 4.0);
    student.showName();
    student.showGPA();
    
    Employee employee = new Employee("Woody", "Woodpecker", 100000);
    employee.showSalary();
  }
}
