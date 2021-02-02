package assignment_one;

import java.util.Scanner;

/**
 * Dice game to get as close to 9 as possible with up to two dice rolls.
 */
public class Nine {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int playerResult = 0;
    int computerResult = 0;
    System.out.print("\nPlaying a game\n====================\n");
    System.out.print("Ready to play? (Y/N) ");
    String firstRoll = myScanner.nextLine();
    if (firstRoll.equals("Y")) {
      playerResult = diceRoll();
      System.out
          .print("You got " + playerResult + " on the first dice.\nWould you like to roll the second dice? (Y/N) ");
      String secondRoll = myScanner.nextLine();
      if (secondRoll.equals("Y")) {
        playerResult += diceRoll();
        System.out.println("You got a total of " + playerResult);
      } else {
        System.out.println("You got " + playerResult);
      }
      computerResult = diceRoll();
      System.out.println("Computer rolls " + computerResult);
      if (computerResult < 5) {
        computerResult += diceRoll();
        System.out.println("Computer rolls again and gets a total of " + computerResult);
      }
      System.out.println(checkWinner(playerResult, computerResult));
    }
    myScanner.close();
  }

  /**
   * Rolls a dice.
   *
   * @return a random integer between 1 and 6.
   */
  private static int diceRoll() {
    int diceRoll = (int) (Math.random() * 6 + 1);
    return diceRoll;
  }

  /**
   * Compares two integers as the player and computer results and returns a string
   * depending on which participant has won.
   *
   * @param playerResult   as the player result.
   * @param computerResult as the computer result.
   * @return a string.
   */
  private static String checkWinner(int playerResult, int computerResult) {
    if ((playerResult < 10 && playerResult > computerResult) || (playerResult < 10 && computerResult > 9)) {
      return "You won!!";
    } else {
      return "Computer wins!";
    }
  }
}
