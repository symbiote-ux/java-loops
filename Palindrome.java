import java.util.Scanner;

public class Palindrome {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int temp = num;
    int reverseNum = 0;
    while (temp > 0) {
      reverseNum = temp % 10 + reverseNum * 10;
      temp = temp / 10;
    }
    if (num == reverseNum) {
      System.out.println("true") ;
    } else {
      System.out.println("false");
    }
  } 
}
