import java.util.Scanner;

public class ThreeDigitsCombinationOf1ToNDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int numberOfCombinations = 0;
    for(int i=1; i<=N; i++){
      for(int j=1; j<=N; j++){
        for(int k=1; k<=N; k++){
          if(i !=j && j != k && i != k){
            numberOfCombinations++;
            System.out.println(i + "" + j + "" + k);
          }
        }
      }
    }
    System.out.println("Total 3 digits combination of 1 to " + N + " is = " + numberOfCombinations);
  }  
}
