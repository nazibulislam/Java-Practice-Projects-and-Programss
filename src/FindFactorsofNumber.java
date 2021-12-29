import java.util.Scanner;

public class FindFactorsofNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int input = sc.nextInt();
    int count = 0;
    for(int i=1; i<=(int)Math.sqrt(input); i++){
      if(input%i == 0 && Math.pow(i, 2) != input)
        count+=2;
      else if(Math.pow(i, 2) == input)
        count++;
    }
    System.out.format("Factors of %d is %d.",input,count);
    sc.close();
  }
}
