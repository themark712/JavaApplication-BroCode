/*
  static keyword
*/
package javaapplication.main043;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // static : makes a variable or method belong to the class,
    //          rather than to a specific object
    //          Commonly used for utility methods or shared resources
    //          Java examples: Math.pow(), String.toUppercase()
    
    Friend friend1 = new Friend("Woody Woodpecker");
    System.out.println(friend1.name);
    System.out.println(Friend.numOfFriends);
    
    Friend friend2 = new Friend("Tom Cat");
    System.out.println(friend2.name);
    System.out.println(Friend.numOfFriends);
    
    Friend friend3 = new Friend("Bugs Bunny");
    System.out.println(friend3.name);
    System.out.println(Friend.numOfFriends);
    
    Friend friend4 = new Friend("Foghorn Leghorn");
    System.out.println(friend4.name);
    System.out.println(Friend.numOfFriends);
    
    Friend friend5 = new Friend("Wally Walrus");
    System.out.println(friend5.name);
    System.out.println(Friend.numOfFriends);
    
    Friend.showFriends();
    }
}
