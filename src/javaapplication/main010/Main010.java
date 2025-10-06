/*
  printf() function
 */
package javaapplication.main010;

public class Main010 {
  public static void main(String[] args) {
    // printf() is a method used to format output
    // printf(%[flags][width][.precision][specifier-character]
    //   specifier-character :
    //     String  : s
    //     char    : c
    //     int     : d
    //     double  : f
    //     char    : c
    //     boolean : b
    
    String name = "Homer Simpson";
    char firstLetter = 'H';
    int age = 43;
    double height = 72.5;
    boolean isEmployed = true;
    
    // specifier-character
    System.out.printf("Hello %s\n", name);
    System.out.printf("Your name starts with a(n) %c\n", firstLetter);
    System.out.printf("You are %d years old\n", age);
    System.out.printf("You are %f inches tall\n", height);
    System.out.printf("Employed: %b\n", isEmployed);
    
    // displaying multiple variables
    System.out.printf("%s is %d years old.\n", name, age);
    
    // precision
    double price1 = 9.9997;
    double price2 = 10019.150392;
    double price3 = -54.0154;
    
    System.out.printf("%f\n", price1);   // default precision is 6 digits
    System.out.printf("%f\n", price2);
    System.out.printf("%f\n", price3);
    
    System.out.printf("%.1f\n", price1);   // precision of 1 digit
    System.out.printf("%.2f\n", price2);   // precision of 2 digits
    System.out.printf("%.3f\n", price3);   // precision of 3 digits
    
    // flags
    // +     : outputs a plus sign for positive numbers
    // ,     : comma grouping seperator
    // (     : negative numbers are enclosed in ()
    // space : display a minus if negative, space if positive
    
    System.out.printf("%+.2f\n", price1);
    System.out.printf("%,.2f\n", price2);
    System.out.printf("%(.2f\n", price3);
    System.out.printf("% .2f\n", price2);
    System.out.printf("% .2f\n", price3);
    
    // width
    int id1 = 1;
    int id2 = 23;
    int id3 = 475;
    int id4 = 9591;
    
    // zero-padded to width of 4
    System.out.printf("%04d\n", id1);
    System.out.printf("%04d\n", id2);
    System.out.printf("%04d\n", id3);
    System.out.printf("%04d\n", id4);
    
    // space-padded to width of 4, right-justified
    System.out.printf("%4d\n", id1);
    System.out.printf("%4d\n", id2);
    System.out.printf("%4d\n", id3);
    System.out.printf("%4d\n", id4);
    
    // space-padded to width of 4, left-justified
    System.out.printf("%-4d\n", id1);
    System.out.printf("%-4d\n", id2);
    System.out.printf("%-4d\n", id3);
    System.out.printf("%-4d\n", id4);
  }
  
}
