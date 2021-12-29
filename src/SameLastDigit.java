import java.util.Scanner;

public class SameLastDigit {
  public static void main(String[] args) {
  // Write your code here
  Scanner sc = new Scanner(System.in);
  int a =sc.nextInt();
  int b =sc.nextInt();
  int c =sc.nextInt();
  if(a%10 == b%10 || b%10 == c%10 || c%10 == a%10)
    System.out.println("True");
  else
    System.out.println("False");

  sc.close();
 }
}

