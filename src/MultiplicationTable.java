import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number for multiplication table:");
    int number = sc.nextInt();
    for(int i = 1; i <= 10; i++){
      System.out.println(String.format("%d * %d = %d", number, i, number*i));
    }
    sc.close();
  }
}
