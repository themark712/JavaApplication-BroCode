package javaapplication.main036;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Project : Quiz Game
    // Questions array[]
    // Options array[][]
    // declare variables
    // welcome message
    // question (loop)
    //   list options
    //   get guess from user
    //   check guess
    // display final score

    Scanner scanner = new Scanner(System.in);

    String[] questions = {
      "Who played Hawkeye in M*A*S*H?",
      "Who is the hero of the Dark Tower series?",
      "What is the captial of Kentucky?",
      "Which was a star in Seinfeld?",
      "What year did World War I start?"
    };

    String[][] options = {
      {"1. Alan Alda", "2. Maclean Stevenson", "3. Wayne Rogers", "4. Larry Linville"},
      {"1. Susannah", "2. Eddie", "3. Roland", "4. Walter"},
      {"1. Louisville", "2. Bowling Green", "3. Lexington", "4. Franfort"},
      {"1. Ray Romano", "2. Jason Alexander", "3. Kevin James", "4. Tim Allen"},
      {"1. 1900", "2. 1914", "3. 1919", "4. 1920"}
    };

    int[] answers = {1, 3, 4, 2, 2};

    int score = 0;
    int guess;

    System.out.println("**********************");
    System.out.println(" Welcome to Quiz Game");
    System.out.println("**********************\n");

    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);
      for (String option : options[i]) {
        System.out.println(option);
      }
      
      System.out.print("Enter your guess: ");
      guess = scanner.nextInt();
      
      if (guess == answers[i]) {
        System.out.println("CORRECT!");
        score += 10;
      } else {
        System.out.println("Wrong");
      }
    }
        System.out.println("Your score: " + score);

    scanner.close();
  }
}
