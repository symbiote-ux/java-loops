import java.util.Scanner;

public class AllPrime {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= n; i++) {
      for (int j = 2; j <= i - 1; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime)
      System.out.println(i);
    }
  }
}
