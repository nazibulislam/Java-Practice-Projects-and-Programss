import java.util.Scanner;

public class FindEvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int input = sc.nextInt();
    if(input%2==0)
      System.out.println(input + " is an even number!");
    else
      System.out.println(input + " is an odd number!");
    sc.close();
  }
}
