import java.io.Console;

public class MealTime {
  public static void main(String[] args) {
    askWhatYouAreFor("breakfast");
    askWhatYouAreFor("lunch");
    askWhatYouAreFor("dinner");
  }

  public static void askWhatYouAreFor(String meal) {
    Console myConsole = System.console();
    System.out.println("What did you eat for " + meal + "?");
    String yourFood = myConsole.readLine();
    System.out.println("You had " + yourFood + " for " + meal + ".");
  }
}
