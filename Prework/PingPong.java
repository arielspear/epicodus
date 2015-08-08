import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Please, enter a number.");
    String numberString = myConsole.readLine();
    Integer number = Integer.parseInt(numberString);
    System.out.println("Okay, let's play Ping-Pong.");

    pingPong(number);
  }
  public static void pingPong(Integer number) {

    for (Integer i = 0 ; i <= number ; i++ ) {
      if (( i % 3 == 0) && ( i % 5 == 0)){
        System.out.println("Ping-Pong");
      } else if ( i % 3 == 0) {
        System.out.println("Ping");
      } else if ( i % 5 == 0) {
        System.out.println("Pong");
      } else {
        System.out.println(i);
      }
    }

  }
}
