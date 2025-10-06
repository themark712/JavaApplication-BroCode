/*
  mad libs game
*/
package javaapplication.main004;

import java.util.Scanner;
import java.text.MessageFormat;

public class Main004 {

  public static void main(String[] args) {
    // declare variables
    int number0;
    String measureOfTime1;
    String modeOfTransportation2;
    String adjective3;
    String adjective4;
    String noun5;
    String color6;
    String partOfBody7;
    
    // create Scanner object to accept input
    Scanner scanner = new Scanner(System.in);
    
    // get user input
    System.out.print("Enter a number: ");
    number0 = scanner.nextInt();
    scanner.nextLine();     // clear buffer from previous int input
    
    System.out.print("Enter a measurement of time: ");
    measureOfTime1 = scanner.nextLine();
    
    System.out.print("Enter a mode of transportation: ");
    modeOfTransportation2 = scanner.nextLine();
    
    System.out.print("Enter an adjective: ");
    adjective3 = scanner.nextLine();
    
    System.out.print("Enter an adjective: ");
    adjective4 = scanner.nextLine();
    
    System.out.print("Enter a plural noun: ");
    noun5 = scanner.nextLine();
    
    System.out.print("Enter a color: ");
    color6 = scanner.nextLine();
    
    System.out.print("Enter a part of the body: ");
    partOfBody7 = scanner.nextLine();
    
    // print results using MessageFormat class
    String story = MessageFormat.format("It was about {0} {1} ago when I came to the hospital in a {2}. ", 
            number0, measureOfTime1, modeOfTransportation2);
    story += MessageFormat.format("The hospital is a/an {0} place, there are alot of {1} {2} there. ", 
            adjective3, adjective4, noun5);
    
    story += MessageFormat.format("There are nurses here who have {0} {1}. ", color6, partOfBody7);
    System.out.println(story);
    
    scanner.close();
  }
}
