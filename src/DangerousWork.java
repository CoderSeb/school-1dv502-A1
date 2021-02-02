/**
 * Calculates the amount of days it will take to earn a given amount of money if
 * the salary is exponential each day.
 */
public class DangerousWork {
  public static void main(String[] args) {
    System.out.println("How much would you like to earn?");
    String moneyToBeMade = System.console().readLine();
    int days = moneyMaker(moneyToBeMade);
    if (days < 31) {
      System.out.print("You will have your money in " + days + " days.");
    } else {
      System.out.print("Oh no! You died on day " + days + ".");
    }
  }

  /**
   * Takes in the amount of money to be earned and calculates the amount of days
   * it would take.
   *
   * @param moneyToBeMade as the amount of money to earn.
   * @return the amount of days to earn the given amount.
   */
  static int moneyMaker(String moneyToBeMade) {
    int moneyToMake = Integer.parseInt(moneyToBeMade);
    int maximumDays = 30;
    int day = 0;
    double currentMoney = 0.01;
    while (day <= maximumDays && currentMoney < moneyToMake) {
      currentMoney *= 2;
      day += 1;
    }
    return day;
  }
}
