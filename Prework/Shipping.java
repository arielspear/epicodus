import java.io.Console;

public class Shipping {
  // public static void main(String[] args) {
  //   calculateCost();
  // }

  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How many pounds does your package weigh?");
    String weightString = myConsole.readLine();
    Integer weight = Integer.parseInt(weightString);

    System.out.println("How many miles will your package be traveling?");
    String distanceString = myConsole.readLine();
    Integer distance = Integer.parseInt(distanceString);

    Integer price = (((weight / 10) * distance) + 6);
    System.out.println("It will cost you $" + price + " to ship your package.");

  }
}
