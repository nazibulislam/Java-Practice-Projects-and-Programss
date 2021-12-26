import java.util.Scanner;

public class SumOfDigitsOfNumber {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to sum its digits:");
    int number = sc.nextInt();
    int result = 0;
    while(number != 0){
      result += number%10;
      number /= 10;
    }
    System.err.println("Result = " + result);
    sc.close();
  }
}
