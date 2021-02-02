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
