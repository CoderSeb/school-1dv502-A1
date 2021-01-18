public class Nine {
  public static void main(String[] args) {
    int playerResult = 0;
    int computerResult = 0;
    System.out.print("\nPlaying a game\n====================\n");
    System.out.print("Ready to play? (Y/N) ");
    String firstRoll = System.console().readLine();
    if (firstRoll.equals("Y")) {
      playerResult = diceRoll();
      System.out
          .print("You got " + playerResult + " on the first dice.\nWould you like to roll the second dice? (Y/N) ");
      String secondRoll = System.console().readLine();
      if (secondRoll.equals("Y")) {
        playerResult += diceRoll();
        System.out.println("You got a total of " + playerResult);
      } else {
        System.out.println("You got " + playerResult);
      }
      computerResult = diceRoll();
      System.out.println("Computer got " + computerResult + " on the first roll.");
      computerResult += diceRoll();
      System.out.println("Computer rolls again and gets a total of " + computerResult);
      System.out.println(checkWinner(playerResult, computerResult));
    }
  }

  private static int diceRoll() {
    int diceRoll = (int) (Math.random() * 6 + 1);
    return diceRoll;
  }

  private static String checkWinner(int playerResult, int computerResult) {
    if ((playerResult < 10 && playerResult > computerResult) || (playerResult < 10 && computerResult > 9)) {
      return "You won!!";
    } else {
      return "Computer wins!";
    }
  }
}
