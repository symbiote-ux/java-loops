import java.util.Scanner;

public class Reverse {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int reverse = 0;
    while(n > 0){
        int rem = n % 10;
        n = n/10;
        reverse = reverse * 10 + rem;
    }
    System.out.print(reverse);
}
}
