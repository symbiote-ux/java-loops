import java.util.Scanner;
public class NumberStarPattern {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int i = 1;
    while (i <= num) {
      int j = 0;
      int toPrint = num;
      while (j < num) {
        if (toPrint == i) {
          System.out.print("*");
        } else
        System.out.print(toPrint);
        j++;
        toPrint--;
      }
      System.out.println();
      i++;
    }
  }
}
