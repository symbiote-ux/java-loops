import java.util.Scanner;
public class CheckNoSeq {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int count = s.nextInt();
    int prev = s.nextInt();
    int curr = s.nextInt();
    int i = 2;
    while (prev > curr) {
      if (i >= count) {
        System.out.println("true");
      }
      prev = curr;
      curr = s.nextInt();
      i++;
    }
    if (prev == curr) {
      System.out.println("false");
      return;
    }
    while (prev < curr) {
      if (i >= count) {
        System.out.println("true");
      }
      prev = curr;
      curr = s.nextInt();
      i++;
    }
    System.out.println("false");
  }
}
