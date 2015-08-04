import java.io.Console;

public class Madlib {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a noun.");
    String noun = myConsole.readLine();

    System.out.println("Give me a adjective.");
    String adjective = myConsole.readLine();

    System.out.println("Give me a verb.");
    String verb = myConsole.readLine();

    System.out.println("Give me another noun.");
    String otherNoun = myConsole.readLine();

    System.out.println("The " + adjective + " " + noun + " " + verb + " with the " + otherNoun + ".");

  }

}
