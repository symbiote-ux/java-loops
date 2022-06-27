import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int binary = s.nextInt();
    int decimal = 0;
    int i = 0;
    while (binary > 0) {
      decimal += (binary % 10) * Math.pow(2, i);
      binary /= 10;
      i++;
    }
    System.out.println(decimal);
  }
}
