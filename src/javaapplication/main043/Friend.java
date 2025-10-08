package javaapplication.main043;

public class Friend {
  //int numOfFriends;   // this creates an instance variable, unique for each object
  // static property
  static int numOfFriends;   // this creates a static (class) variable, applies to all object
  String name;
  
  Friend(String name) {
    this.name = name;
    numOfFriends++;
  }
  
  // static method
  static void showFriends() {
    System.out.println("You have " + numOfFriends + " friends");
  }
}
