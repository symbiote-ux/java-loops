import java.util.Scanner;

public class NthFibonachi {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int firstTerm = 1;
    int nextTerm = 0;
    int currentTerm = 0;
    for (int i = 1; i <= n; i++) {
      currentTerm = firstTerm + nextTerm;
      firstTerm = nextTerm;
      nextTerm = currentTerm;
    }
    System.out.println(currentTerm);
  }
}