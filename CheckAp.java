import java.util.Scanner;

public class CheckAp {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int count = s.nextInt();

    int prev = s.nextInt();
    int curr = s.nextInt();
    int diff = curr - prev;

    for (int i = 2; i < count; i++) {
      prev = curr;
      curr = s.nextInt();     
      if ((curr - prev) != diff) {
        System.out.println("false");
        return;
      }
    }
    System.out.println("true");
  }
}
