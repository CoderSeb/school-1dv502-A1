package assignment_one;

import java.util.Scanner;

/**
 * Takes in a year and month and prints that month's calendar.
 */
public class PrintCalender {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.print("Enter a year after 1800: ");
    int year = myScanner.nextInt();
    System.out.print("Enter month (1-12): ");
    int month = myScanner.nextInt();

    System.out.println(getMonth(month) + " " + year);
    System.out.println("----------------------------");
    System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
    printCalendar(year, month);
    myScanner.close();
  }

  /**
   * Takes in a number representing the month and returns the name of that month.
   *
   * @param month as the integer representing the month.
   * @return the month as a string.
   */
  static String getMonth(int month) {
    String[] monthArray = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" };
    return monthArray[month - 1];
  }

  /**
   * Takes in year and month and prints the calendar.
   *
   * @param year  as the year.
   * @param month as the month.
   */
  static void printCalendar(int year, int month) {
    int startDay = startDay(year, month);
    int totalDays = getDaysInMonth(year, month);

    int i = 0;
    for (i = 0; i < startDay; i++)
      System.out.print("    ");

    for (i = 1; i <= totalDays; i++) {
      System.out.printf("%4d", i);
      // Prints a new row every 7 days including start day 7, 14, 21 and so on.
      if ((i + startDay) % 7 == 0)
        System.out.println();
    }

  }

  /**
   * Checks if a year is a leapyear and returns the appropriate boolean value.
   * Formula src: https://www.mathsisfun.com/leap-years.html
   *
   * @param year as the year to check.
   * @return boolean value, true if the year is a leap year.
   */
  static boolean checkLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }

  /**
   * Takes in year and month and returns the start day of that month. 0 for
   * monday, 1 for tuesday etc.
   *
   * @param year  as the year.
   * @param month as the month.
   * @return the integer representing the start day of the corresponding month.
   */
  static int startDay(int year, int month) {
    int days = getTotalDays(year, month);
    // 2 as the first of january 1800 was a wednesday mon(0), tue(1), wed(2).
    int result = (days + 2) % 7;
    return result;
  }

  /**
   * Takes in year and month and returns the amount of days in that month.
   *
   * @param year  as the year.
   * @param month as the month
   * @return the number of days in the corresponding month.
   */
  static int getDaysInMonth(int year, int month) {
    if (month == 2) {
      if (checkLeapYear(year)) {
        return 29;
      } else {
        return 28;
      }
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      return 30;
    } else {
      return 31;
    }
  }

  /**
   * Takes in year and month and returns the total number of days since January 1
   * 1800.
   *
   * @param year  as the year.
   * @param month as the month.
   * @return total number of days.
   */
  static int getTotalDays(int year, int month) {
    int result = 0;

    for (int i = 1800; i < year; i++)
      if (checkLeapYear(i))
        result += 366;
      else
        result += 365;

    for (int i = 1; i < month; i++)
      result += getDaysInMonth(year, i);

    return result;
  }
}
