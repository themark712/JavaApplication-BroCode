/*
  String methods
 */
package javaapplication.main013;

import java.util.Scanner;

public class Main013 {

  public static void main(String[] args) {
    String name = "   Mark Johnson   ";

    // length : return length of string
    int length = name.length();
    System.out.println(length);

    // charAt(index) : return character at position index of string
    char letter = name.charAt(9);
    System.out.println(letter);

    // indexOf(string) : returns index of first occurance of provided string
    //   case-sensitive, returns -1 if string is not found
    int index = name.indexOf("o");
    System.out.println(index);
    index = name.indexOf("john");
    System.out.println(index);

    // lastIndexOf(string) : return index of first occurance of provided string
    //   case-sensitive, returns -1 if string is not found
    int lastIndex = name.lastIndexOf("o");
    System.out.println(lastIndex);
    index = name.indexOf("O");
    System.out.println(index);

    // .toUpperCase() : returns string in all capital letters
    String upper = name.toUpperCase();
    System.out.println(upper);

    // .toLowerCase() : returns string in all lower case letters
    String lower = name.toLowerCase();
    System.out.println(lower);

    // .trim() : trims leading and trailing spaces
    System.out.println(name.trim());

    // .replace(find, replace) : replaces all occurances of find with replace
    String replaced = name.replace("Mark", "Jose");
    System.out.println(replaced);

    // .isEmpty() : returns true if empty string, false if not
    System.out.println(name.isEmpty());

    if (name.isEmpty()) {
      System.out.println("Your name is empty");
    }
    else {
      System.out.println("Your name is " + name);
    }

    // .contains(string) : return boolean if string is found (case-sensitive)
    if (name.contains("Mark")) {
      System.out.println("Your name has my name");
    }
    else {
      System.out.println("Your name does not contain Mark");
    }
    
    // .equals(string) : returns boolean if string parameter is equal to original string (case-sensitive)
    if(name.equals(name.toLowerCase())) {
      System.out.println("Your name is lower case");
    } else {
      System.out.println("Your name is not mark johnson");
    }
  }

}
