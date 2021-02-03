package assignment_one;

import java.util.Scanner;

/**
 * Play a game of Scissor, paper, rock!
 */
public class GameSRP {
  static int draw = 0;
  static int playerWin = 0;
  static int computerWin = 0;

  public static void main(String[] args) {
    askForGame();
  }

  /**
   * Calls the rockPaperScissor method if the input is 1, 2 or 3. Otherwise it
   * exits the game.
   */
  public static void askForGame() {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("\nScissor (1), rock (2), paper (3) or 0 to quit: ");
    int playerInput = Integer.parseInt(myScanner.nextLine());
    if (playerInput <= 3 && playerInput > 0) {
      rockPaperScissor(playerInput);
    } else {
      String scoreOutput = "You " + playerWin + ", computer " + computerWin + ", draw " + draw;
      System.out.print("\nScore: " + scoreOutput + "." + "\nAbout to exit...");
    }
    myScanner.close();
  }

  /**
   * Game logic method.
   *
   * @param playerInput as the player's choice.
   */
  public static void rockPaperScissor(int playerInput) {
    int computerResult = randomNumber(1, 3);
    if (computerResult == playerInput) {
      System.out.print("It's a draw!");
      draw++;
      askForGame();
    } else if (computerResult == 1 && playerInput == 2) {
      System.out.print("You won, computer had scissor!");
      playerWin++;
      askForGame();
    } else if (computerResult == 1 && playerInput == 3) {
      System.out.print("You lost, computer had scissor!");
      computerWin++;
      askForGame();
    } else if (computerResult == 2 && playerInput == 3) {
      System.out.print("You won, computer had rock!");
      playerWin++;
      askForGame();
    } else if (computerResult == 2 && playerInput == 1) {
      System.out.print("You lost, computer had rock!");
      computerWin++;
      askForGame();
    } else if (computerResult == 3 && playerInput == 1) {
      System.out.print("You won, computer had paper!");
      playerWin++;
      askForGame();
    } else if (computerResult == 3 && playerInput == 2) {
      System.out.print("You lost, computer had paper!");
      computerWin++;
      askForGame();
    }
  }

  /**
   * Returns a random integer between min and max.
   *
   * @param min as the minimum number.
   * @param max as the maximum number.
   * @return The random integer.
   */
  public static int randomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }
}
