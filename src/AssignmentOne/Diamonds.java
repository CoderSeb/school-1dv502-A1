package AssignmentOne;

import java.util.Scanner;

/**
 * Creates a diamond with the height chosen.
 */
public class Diamonds {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Give a positive number: ");
    String strNumber = myScanner.nextLine();
    int positiveNumber = Integer.parseInt(strNumber);
    int empty = positiveNumber - 1;
    for (int i = 0; i < positiveNumber; i++) {
      for (int j = 0; j < empty; j++) {
        System.out.print(" ");
      }
      empty--;
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    empty = 1;
    for (int i = 0; i < positiveNumber; i++) {
      for (int j = 0; j < empty; j++) {
        System.out.print(" ");
      }
      empty++;
      for (int k = 0; k < 2 * (positiveNumber - empty) + 1; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    myScanner.close();
  }
}
