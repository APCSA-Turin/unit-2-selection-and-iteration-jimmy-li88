
import java.util.Scanner;
public class Mainu {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer greater than 5: ");
    int userNumber = scanner.nextInt();
    while (userNumber < 5) {
      System.out.print("Invalid input. Please enter an integer greater than 5: ");
      userNumber = scanner.nextInt();
    }
    if (userNumber > 5) {
      int i = 0;
      while (i <= userNumber) {
        System.out.println(i);
        i++;
      }
    }


  }
}


