import java.io.Console;

public class Drink {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How old are you?");
    String ageString = myConsole.readLine();
    Integer age = Integer.parseInt(ageString);

    canYouDrink(age);

  }
  public static void canYouDrink(Integer age) {
    if ( age >= 21 ){
      System.out.println("You may drink.");
    } else {
      System.out.println("You may not drink.");
    }
  }
}
