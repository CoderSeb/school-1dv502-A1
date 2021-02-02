package assignment_one;

import java.util.Scanner;

public class GameSRP {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Scissor (1), rock (2), paper (3) or 0 to quit: ");
    int playerInput = Integer.parseInt(myScanner.nextLine());
    System.out.print(playerInput);
    myScanner.close();
  }
}
