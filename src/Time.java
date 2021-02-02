/**
 * Takes in a number of seconds and converts it to hours, minutes and seconds.
 */
public class Time {
    public static void main(String[] args) {
        System.out.println("\nEnter a number of seconds: ");
        // Saves the entered number to the variable stringOfSeconds.
        String stringOfSeconds = System.console().readLine();
        System.out.print("You have entered " + stringOfSeconds);
        int numberOfSeconds = Integer.parseInt(stringOfSeconds);
        int timeHours = numberOfSeconds / 3600;
        int timeMinutes = (numberOfSeconds % 3600) / 60;
        int timeSeconds = numberOfSeconds % 60;

        String result = "\nThis corresponds to: " + timeHours + " hours, " + timeMinutes + " minutes and " + timeSeconds
                + " seconds.";
        System.out.println(result);
    }
}
