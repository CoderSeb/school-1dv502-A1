package assignment_one;

import java.util.Scanner;

/**
 * Converts a dexadecimal string to a decimal value.
 */
public class Hex2Dec {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("\nEnter a hex number: ");
    String input = myScanner.nextLine();
    System.out.println("The decimal value for " + input + " is " + hexToDecimal(input));
    myScanner.close();
  }

  /**
   * Takes in a hexadecimal string and returns it's decimal value.
   * 
   * @param hex as the hexadecimal string.
   * @return
   */
  static int hexToDecimal(String hex) {
    hex = hex.toUpperCase();
    // To get the decimal values, A = 10, B = 11 and so on.
    String baseString = "0123456789ABCDEF";
    int result = 0;
    for (int i = 0; i < hex.length(); i++) {
      char character = hex.charAt(i);
      int number = baseString.indexOf(character);
      result = 16 * result + number;
    }
    return result;
  }
}
