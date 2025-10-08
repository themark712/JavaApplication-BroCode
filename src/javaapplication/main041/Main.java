/*
  Overloaded constructors
*/
package javaapplication.main041;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // overloaded constructor : all
    //               You can pass arguments to a constructor and set up initial values
    
    User user1 = new User("Homer Simpson");
    User user2 = new User("Wile E. Coyote", "wilee@acme.com");
    User user3 = new User("Elmer Fudd", "fudd212@hunters.com", 37);
    User user4 = new User();
    
    System.out.println(user1.username);
    System.out.println(user1.email);
    System.out.println(user1.age);
    
    System.out.println(user2.username);
    System.out.println(user2.email);
    System.out.println(user2.age);
    
    System.out.println(user3.username);
    System.out.println(user3.email);
    System.out.println(user3.age);
    
    System.out.println(user4.username);
    System.out.println(user4.email);
    System.out.println(user4.age);
  }
}
