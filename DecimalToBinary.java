import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int decimal = s.nextInt();
    long binary = 0L;
    int place = 1;
    while (decimal > 0) {
      binary = binary + (decimal % 2) * place;
      ;
      decimal /= 2;
      place *= 10;
    }
    System.out.println(binary);
  }
}
