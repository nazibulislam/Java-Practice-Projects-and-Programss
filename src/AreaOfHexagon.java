import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class AreaOfHexagon {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a side length of Hexagon's:");
    short length = sc.nextShort();
    System.out.println("Area = " + (6*Math.pow(length,2)/(4*Math.tan(Math.PI/6))));
  }
  
}
