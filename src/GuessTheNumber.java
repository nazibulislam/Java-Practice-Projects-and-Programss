import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int randomNumber = (int)(Math.random()*100);
    int guess;
    int limit = 5;
    while(limit != 0){
      System.out.println(String.format("You have %d try(s) left", limit));
      System.out.println("Guess the number: (1-100)");
      guess = sc.nextInt();
      if(guess == randomNumber){
        System.out.println(String.format("Awesome, you guessed the number! The number was %d", randomNumber));
        break;
      }
      else if(Math.abs(randomNumber-guess) >= 20 && randomNumber<guess)
        System.out.println("Your number is much larger");
      else if(Math.abs(randomNumber-guess) >= 20 && randomNumber>guess)
        System.out.println("Your number is much smaller");
      else if(Math.abs(randomNumber-guess) < 20 && randomNumber<guess)
        System.out.println("Your number is a bit larger");
      else if(Math.abs(randomNumber-guess) < 20 && randomNumber>guess)
        System.out.println("Your number is a bit smaller");
      limit--;
    }
    if(limit == 0)
      System.out.println("Bad luck! You ran out of tries! The number was " + randomNumber);
  sc.close();
    }
}
