
// 1
import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.print("Enter number: ");
    int userInput = myObj.nextInt();

    if ((userInput % 2) == 0) {
      System.out.println("The number " + userInput + " is even" );
    } else {
      System.out.println("The number " + userInput + " is odd" );
    }
  }
}
