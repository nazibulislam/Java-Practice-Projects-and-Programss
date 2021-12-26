import java.util.Scanner;

public class CountLettersNumbersSpacesOthersInString {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int letters = 0, numbers = 0, spaces = 0, others = 0;
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
        letters++;
      else if(s.charAt(i)>='0' && s.charAt(i)<='9')
        numbers++;
      else if(s.charAt(i) == ' ')
        spaces++;
      else
        others++;
    }
    System.out.println("Letters = "+letters);
    System.out.println("numbers = "+numbers);
    System.out.println("Spaces = "+spaces);
    System.out.println("Others = "+others);
  }
}
