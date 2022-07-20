import java.util.Scanner;

public class MaxNumber {
  public static int getPower(int num, int power) {
    int result  = 1 ;
    int i = 0;
    while (i < power) {
      result *= num;
      i++;
    }
    return result;
  }

  public static int getMaxNumber(int num) {
    int temp = num;
    int index = 0;
    int toRemove = temp % 10;
    temp = temp / 10;
    while (temp > 0) {
      int rem = temp % 10;
      temp = temp / 10;
      if (toRemove > rem) {
        toRemove = rem;
        index++;
      }
    }
    int left = num / getPower(10, index + 1);
    left = left * getPower(10, index);
    int right = num % getPower(10, index);
    return left + right;
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int maxNumber = getMaxNumber(num);
    System.out.println(maxNumber);
  }
}