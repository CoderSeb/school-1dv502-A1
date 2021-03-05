package assignment_one;

/**
 * Simulates how many steps it will take an ant to visit all squares on a
 * chessboard.
 */
public class Ants {
  static int simCounter = 0;

  public static void main(String[] args) {
    int numberOfRuns = 10;
    int[] resultsArray = new int[numberOfRuns];
    for (int i = 0; i < numberOfRuns; i++) {
      simCounter++;
      resultsArray[i] = runGame();
    }
    System.out.println("Average amount of steps: " + getAverage(resultsArray));
  }

  /**
   * Runs a full simulation and counts the amount of steps the ant has to take.
   * 
   * @return the counter.
   */
  static int runGame() {
    int counter = 0;
    String[][] chessBoard = new String[8][8];
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        chessBoard[i][j] = "AntToBe";
      }
    }
    int randomStartX = GameSRP.randomNumber(0, 7);
    int randomStartY = GameSRP.randomNumber(0, 7);

    chessBoard = startGame(chessBoard, randomStartX, randomStartY);
    while (checkBoard(chessBoard)) {
      chessBoard = takeStep(chessBoard);
      counter++;
    }
    if (simCounter == 1) {
      System.out.println("\nAnts\n=======");
    }
    System.out.println("Number of steps in simulation " + simCounter + ": " + counter);
    return counter;
  }

  /**
   * Places the ant on the chessboard.
   * 
   * @return the chessboard with the ant on it.
   */
  static String[][] startGame(String[][] chessboard, int x, int y) {
    chessboard[x][y] = "CurrentlyOn";
    return chessboard;
  }

  /**
   * Takes in the chessboard 2d array and returns true if the ant has yet to be on
   * a square.
   *
   * @param chessboard as the 2d array.
   * @return boolean value.
   */
  static boolean checkBoard(String[][] chessboard) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (chessboard[i][j] == "AntToBe") {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Takes in the chessboard 2d array and simulates a step for the ant.
   *
   * @param chessboard as the 2d array.
   * @return the 2d array that the ant has stepped on.
   */
  static String[][] takeStep(String[][] chessboard) {
    int randomDirection = GameSRP.randomNumber(1, 4);
    int x = 0;
    int otherX = 0;
    int y = 0;
    int otherY = 0;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (chessboard[i][j] == "CurrentlyOn") {
          x = otherX = i;
          y = otherY = j;
        }
      }
    }
    // 1 = up, 2 = right, 3 = down and 4 = left.
    if (randomDirection == 1) {
      y++;
    } else if (randomDirection == 2) {
      x++;
    } else if (randomDirection == 3) {
      y--;
    } else {
      x--;
    }
    // Hit a wall
    if ((x < 0 || y < 0) || (x > 7 || y > 7)) {
      takeStep(chessboard);
    } else {
      chessboard[otherX][otherY] = "AntWasHere";
      chessboard[x][y] = "CurrentlyOn";
    }
    return chessboard;
  }

  /**
   * Simple average calculator method.
   * 
   * @param resultsArray as the results to be "averaged".
   * @return the average number as a double.
   */
  static double getAverage(int[] resultsArray) {
    double total = 0;
    for (int i = 0; i < resultsArray.length; i++) {
      total = total + resultsArray[i];
    }
    return total / resultsArray.length;
  }

}
