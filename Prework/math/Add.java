import java.io.Console;

public class Add {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number.");
    String firstNumString = myConsole.readLine();
    Integer firstNum = Integer.parseInt(firstNumString);

    System.out.println("Give me another number.");
    String secondNumString = myConsole.readLine();
    Integer secondNum = Integer.parseInt(secondNumString);

    Integer sum = firstNum + secondNum;
    System.out.println(firstNum + " + " + secondNum + " = " + sum);
  }
}
