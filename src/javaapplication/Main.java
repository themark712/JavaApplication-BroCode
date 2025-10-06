/*
  String .substring() function
 */
package javaapplication;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // .substring() : A method used to extract a portion of a string
    //                  .substring(start, end)
    //                Both parameters are zero-based, end parameter is exclusive
    //                end parameter is optional, defaults to end of string

    Scanner scanner = new Scanner(System.in);

    String email;
    String username;
    String domain;

    System.out.println("Enter your email: ");
    email = scanner.nextLine();

    // validate email
    if (email.contains("@")) {

      // get first 4 letters
      String firstFour = email.substring(0, 4);
      System.out.println(firstFour);

      // get substring based on character occurance ("@")
      username = email.substring(0, email.indexOf("@"));
      System.out.println(username);

      // get substring after character occurance ("@")
      domain = email.substring(email.indexOf("@") + 1);  // + 1 skips parameter character
      System.out.println(domain);
    }
    else {
      System.out.println("Email must contain @");
    }
    scanner.close();
  }

}
