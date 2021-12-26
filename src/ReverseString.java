import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder s = new StringBuilder(sc.nextLine());
    System.out.println(s.reverse());

    // Now redoing by iteration

    String st = sc.nextLine();
    String result = "";
    for(int i=st.length()-1; i>=0; i--){
      result += st.charAt(i);
    }
    System.out.println(result);
    sc.close();
  }
}
