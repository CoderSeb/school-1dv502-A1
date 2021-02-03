package assignment_one;

import java.util.Scanner;

/**
 * Get the day of the week.
 */
public class DayOfWeek {
  static Scanner myScanner = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      getInformation();
    }
  }

  /**
   * Takes in parameters as stated below and calculates to get the correct day.
   *
   * @param j as the year divided by 100.
   * @param m as the month.
   * @param q as the day of the month.
   * @param k as the year of the century.
   */
  static void calculateDay(int j, int m, int q, int k) {
    int day = q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j);
    day = day % 7;
    System.out.print("Day of week is " + getDayFromNumber(day) + "\n");
  }

  /**
   * Takes in an integer and returns the day that integer represents.
   * 
   * @param day as the integer.
   * @return the weekday as a string.
   */
  static String getDayFromNumber(int day) {
    String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
    return days[day];
  }

  /**
   * Calls all methods to get information and then calls the calculateDay method.
   */
  static void getInformation() {
    int j = askForYear() / 100;
    int m = askForMonth();
    int q = askForDay();
    int k = j % 100;

    calculateDay(j, m, q, k);
  }

  /**
   * Returns an integer representing the year.
   *
   * @return the integer.
   */
  static int askForYear() {
    System.out.print("\nEnter year: ");
    int yearInput = myScanner.nextInt();
    return yearInput;
  }

  /**
   * Returns an integer representing the month.
   *
   * @return the integer.
   */
  static int askForMonth() {
    System.out.print("Enter month (1-12): ");
    int monthInput = myScanner.nextInt();
    return monthInput;
  }

  /**
   * Returns an integer representing the day of the week.
   *
   * @return the integer.
   */
  static int askForDay() {
    System.out.print("Enter day of the month (1-31): ");
    int dayInput = myScanner.nextInt();
    return dayInput;
  }
}
