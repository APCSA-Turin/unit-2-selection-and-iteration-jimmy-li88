import java.util.Scanner;

public class Runner {
  public static void main(String[] args) {
    int num = 10;
    if (num > 5) {
      num--;
    }
    if (num > 7) {
      num *= 2;
    }
    if (num > 10) {
      num++;
    }
    if (num == 5) {
      num /= 3;
    } else {
      num /= 4;
    }
    System.out.println(num);
  }
}
