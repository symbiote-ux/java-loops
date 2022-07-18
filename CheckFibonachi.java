import java.util.Scanner;

public class CheckFibonachi {

  public static boolean isFibonachi(int num) {
    int prev = 0;
    int curr = 1;
    while (prev <= num) {
      int temp = prev + curr;
      if (prev == num) {
        return true;
      }
      prev = curr;
      curr = temp;
    }
    return false;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if (isFibonachi(num)) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}