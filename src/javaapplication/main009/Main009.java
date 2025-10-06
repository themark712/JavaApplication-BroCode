/*
  Java Math class
 */
package javaapplication.main009;

import java.util.Scanner;

public class Main009 {
  
  public static void main(String[] args) {
    // constants
    // PI
    System.out.println(Math.PI);
    
    // Exponential constant (Euler's number)
    System.out.println(Math.E);
    
    // Methods
    double result;
    
    // Power (Math.pow(base, power)) function: returns base raised to power of power
    result = Math.pow(2, 3);
    System.out.println(result);
    
    // Absolute value (Math.abs(value)): returns absolute value of value
    result = Math.abs(-900);
    System.out.println(result);
    
    // Square root (Math.sqrt(value)) : returns the square root of value
    result = Math.sqrt(999);
    System.out.println(result);
    
    // Rounding (Math.round(value)) : returns value rounded to nearest integer
    result = Math.round(3.14);
    System.out.println(result);
    result = Math.round(3.5);
    System.out.println(result);
    
    // Rounding up (Math.ceil(value)) : returns value rounded to next highest integer
    result = Math.ceil(3.14);
    System.out.println(result);
    
    // Rounding down (Math.floor(value)) : returns value rounded to next lowest integer
    result = Math.floor(3.99);
    System.out.println(result);
    
    // Maximum of two values (Math.max(value1, value2) : returns the higher of value1 and value2
    result = Math.max(1.221, 1.222);
    System.out.println(result);
    
    // Minimum of two values (Math.max(value1, value2) : returns the lower of value1 and value2
    result = Math.max(-1.221, 1.2202);
    System.out.println(result);
    
    Scanner scanner = new Scanner(System.in);
    double sideA;
    double sideB;
    double sideC;
    
    // Exercises
    // Hypotenuse : c = Math.sqrt(a^2 + b^2)
    System.out.print("Input the length of side a: ");
    sideA = scanner.nextDouble();
    
    System.out.print("Input the length of side b: ");
    sideB = scanner.nextDouble();
    
    sideC = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
    System.out.println("Hypotenuse = " + sideC);
    
    // Circumference (circle), Area (circule), Volume (sphere)
    // circumference = 2 * Math.PI * radius
    // area = Math.PI * Math.pow(radius, 2)
    // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
    
    double radius;
    double circumference;
    double area;
    double volume;
    
    System.out.print("Input the radius: ");
    radius = scanner.nextDouble();
    
    circumference = radius * Math.PI * 2;
    area = Math.pow(radius,2) * Math.PI;
    volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    
    // display with desired digits with printf
    System.out.printf("The circumference is: %.2f\n", circumference);
    System.out.printf("The area is: %.2f\n", area);
    System.out.printf("The volume is: %.2f\n", volume);
    
    scanner.close();
  }
  
}
