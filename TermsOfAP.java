import java.util.Scanner;

public class TermsOfAP {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int count = s.nextInt();
    for (int i = 1,j = 1; j <= count; i++) {
      int term = 3 * i + 2;
      if (term % 4 != 0) {
        System.out.print(term + " ");
        j++;
      }
    }
  }
}
