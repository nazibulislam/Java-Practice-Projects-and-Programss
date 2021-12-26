import java.util.Scanner;

public class BinaryAddition {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 2 binary numbers for addition");
    String binary1 = sc.next();
    String binary2 = sc.next();
    System.out.println("Result: "+Integer.toBinaryString(Integer.parseInt(binary1,2)+Integer.parseInt(binary2,2)));
  }
}
