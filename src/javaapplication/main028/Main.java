/*
  Variable scope
 */
package javaapplication.main028;

import java.util.Scanner;

public class Main {

  static int varX = 3;      // CLASS scope, local variables take precedence
                            // accessible throughout entire class

  public static void main(String[] args) throws InterruptedException {
    // variable scope : defines where a variable can be accessed

    Scanner scanner = new Scanner(System.in);

    int varX = 1;     // declared inside method : LOCAL scope
    // local to main() method
    System.out.println(varX);   // varX = 1
    doSomething();
    doSomethingElse();

    scanner.close();
  }

  static void doSomething() {
    int varX = 2;     // declared inside method : LOCAL scope
    // local to doSomething() method, same variable name is ok  
    // varX = 2
    System.out.println(varX);
  }

  static void doSomethingElse() {
    // no local variable, uses class variable
    // varX = 3
    System.out.println(varX);
  }
}
