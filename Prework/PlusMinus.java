import java.io.Console;

public class PlusMinus {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number.");
    String numberString = myConsole.readLine();
    Integer number = Integer.parseInt(numberString);

    if ( number >= 0 ){
      System.out.println( number + " + 1 = " + (number + 1));
    } else {
      System.out.println( number + " - 1 = " + (number - 1));
    }
  }
}
