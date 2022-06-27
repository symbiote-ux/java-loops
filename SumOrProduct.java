import java.util.Scanner;

import javax.swing.plaf.basic.BasicMenuUI.ChangeHandler;

public class SumOrProduct {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int choice = s.nextInt();
    if (choice == 1) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
        sum += i;
      }
      System.out.println(sum);
      return;
    }
    if (choice == 2) {
      int product = 1;
      for (int i = 1; i <= n; i++) {
        product *= i;
      }
      System.out.println(product);
      return;
    }
    System.out.println(-1);
  }
}
