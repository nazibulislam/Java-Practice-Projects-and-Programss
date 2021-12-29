import java.util.Scanner;

public class CapitalizeGivenString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    for(int i=0; i<input.length; i++){
      input[i] = Character.toUpperCase(input[i].charAt(0)) + input[i].substring(1);
    }
    System.out.println(String.join(" ",input));
    sc.close();
  }
}
