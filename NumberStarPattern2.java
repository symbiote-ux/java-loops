import java.util.Scanner;

public class NumberStarPattern2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int i = 0;
    while (i < num) {
      int j = 1;
      while (j < num - i + 1) {
        System.out.print(j);
        j++;
      }
      while (j <= num) {
        System.out.print("*");
        j++;
      }
      j = num;
      while (j >= num - i + 1) {
        System.out.print("*");
        j--;
      }
      while (j >= 1) {
        System.out.print(j);
        j--;
      }
      i++;
      System.out.println();
    }
  }
}
