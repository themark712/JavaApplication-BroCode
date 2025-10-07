package javaapplication.main037;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    // Project : Rock, Paper, Scissors Game
    // declare variables
    // get choice from user
    // get random choice for computer
    // check win conditions
    // as to play again

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String[] choices = {"rock", "paper", "scissors"};
    String playerChoice;
    String computerChoice;
    String playAgain = "yes";
    int won = 0;
    int lost = 0;
    int tied = 0;
    
    do {
      System.out.print("Enter your choice (rock, paper, scissors): ");
      playerChoice = scanner.nextLine().toLowerCase();

      if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
        System.out.println("Invalid choice");
        continue;
      }

      computerChoice = choices[random.nextInt(1, 3)];
      System.out.println("Computer choice: " + computerChoice);

      if (playerChoice.equals(computerChoice)) {
        System.out.println("You tied");
        tied++;
      }
      else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
              || (playerChoice.equals("scissors") && computerChoice.equals("paper"))
              || (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
        System.out.println("You win!");
        won++;
      }
      else {
        System.out.println("You lose.");
        lost++;
      }

      System.out.print("Play again (yes/no)? ");
      playAgain = scanner.nextLine().toLowerCase();

    } while (playAgain.equals("yes"));

    System.out.println("Your record: " + won + "-" + lost + "-" + tied);
    System.out.println("Goodbye!");
    
    scanner.close();
  }
}
