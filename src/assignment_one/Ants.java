package assignment_one;

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
    System.out.println("Number of steps in simulation " + simCounter + ": " + counter);
    return counter;
  }

  static String[][] startGame(String[][] chessboard, int x, int y) {
    chessboard[x][y] = "CurrentlyOn";
    return chessboard;
  }

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

  static String[][] takeStep(String[][] chessboard) {
    int randomDirection = GameSRP.randomNumber(1, 4);
    int x = 0;
    int y = 0;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (chessboard[i][j] == "CurrentlyOn") {
          x = i;
          y = j;

          chessboard[i][j] = "AntWasHere";
        }
      }
    }
    // 1 is up.
    if (randomDirection == 1) {
      y++;
      // 2 is right.
    } else if (randomDirection == 2) {
      x++;
      // 3 is down.
    } else if (randomDirection == 3) {
      y--;
      // 4 is left.
    } else {
      x--;
    }
    // Hit a wall
    if ((x < 0 || y < 0) || (x > 7 || y > 7)) {
      takeStep(chessboard);
    } else {
      chessboard[x][y] = "CurrentlyOn";
    }
    return chessboard;
  }

  static double getAverage(int[] resultsArray) {
    double total = 0;
    for (int i = 0; i < resultsArray.length; i++) {
      total = total + resultsArray[i];
    }

    return total / resultsArray.length;
  }

}
