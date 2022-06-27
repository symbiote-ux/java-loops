import java.util.Scanner;

public class SquareRoot {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int i = 1;
    while (i * i <= num) {
      i++;
    }
    System.out.print(i-1);
  }
}
