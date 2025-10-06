package javaapplication;

public class Main {

  public static void main(String[] args) {
    // Arithmatic operators
    int x = 10;
    int y = 3;
    int z;
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    
    // addition
    z = x + y;
    System.out.println("x + y = " + z);
    
    // subtraction
    z = x - y;
    System.out.println("x - y = " + z);
    
    // multiplication
    z = x * y;
    System.out.println("x * y = " + z);
    
    // division
    z = x / y;   // int variables will exclude remainder
    System.out.println("x / y = " + z);
    
    // modulus/remainder
    z = x % y;
    System.out.println("x % y = " + z);
    
    // augmented assignment operators
    x += y;
    System.out.println("x+=y (x = x+y) = " + x);
    
    x -= y;
    System.out.println("x-=y (x = x-y) = " + x);
    
    x *= y;
    System.out.println("x*=y (x = x*y) = " + x);
    
    x /= y;
    System.out.println("x/=y (x = x/y) = " + x);
    
    x %= y;
    System.out.println("x%=y (x = x%y) = " + x);
    
    // increment and decrement operators
    x++;
    System.out.println("x++ (x = x+1) = " + x);
    
    x--;
    System.out.println("x-- (x = x-1) = " + x);
    
    // order of operations = PEMDAS
    // Parentheses > Exponents > Multiplication > Division > Addition > Subtracter
    double result = 3 + 4 * (7 - 5) / 2.0;
    System.out.println("3 + 4 * (7 - 5) / 2.0 = " + result);
    System.out.println("Parentheses: (7-5) = 2");
    System.out.println("Multiplication: 4 * 2 = 8");
    System.out.println("Division: 8 / 2 = 4");
    System.out.println("Addition: 3 + 4 = 7");
    
    // github test
  }
}
