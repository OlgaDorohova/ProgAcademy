import java.text.DecimalFormat;
import java.util.Scanner;

public class buyBitcoin {
  public static void main(String args[]) {

    System.out.println("For exit write \"quit\" \n");
    Scanner input = new Scanner(System.in);
    int price = 0;
    int userCash = 0;
    double bitcoins = 0;
    DecimalFormat form = new DecimalFormat("#.#######");

    do {
      
      System.out.println("What is Bitcoin price today?");

      if (!input.hasNextInt())
        System.out.println("This is not your Bitcoin price. Try again" + "\n");
      else {
        price = input.nextInt();

        System.out.println("How much $ do you have?");

        while (!input.nextLine().equals("quit")) {

          if (!input.hasNextInt())
            System.out.println("This is not your cash. Try again" + "\n");
          else {
            userCash = input.nextInt();

            bitcoins = (double) userCash / price;

            System.out.printf("You can buy " + form.format(bitcoins) + " BTC" + "\n");
            break;
          }
        }

      }

    } while (!input.nextLine().equals("quit"));
    System.out.print("Exit");
    input.close();
  }
}
