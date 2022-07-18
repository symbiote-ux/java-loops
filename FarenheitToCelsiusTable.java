import java.util.Scanner;

public class FarenheitToCelsiusTable {
  
  public static int convertToCelsius(int temp) {
    return (5 * (temp - 32)) / 9;
  }
  public static void main(String args[]) {
    Scanner  s = new Scanner(System.in);
    int start = s.nextInt();
    int end = s.nextInt();
    int step = s.nextInt();
    for (int i = start; i <= end; i += step) {
      int tempInCelsius = convertToCelsius(i);
      System.out.println(i + " " + tempInCelsius);
    }
  }
}