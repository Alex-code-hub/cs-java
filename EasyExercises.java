
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

//2
import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.print("Enter number: ");
    int firstNumber = myObj.nextInt();
    System.out.print("Enter number: ");
    int secondNumber = myObj.nextInt();
    System.out.print("Enter number: ");
    int thirdNumber = myObj.nextInt();

    System.out.println("The biggest number is:");
    if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
      System.out.println(firstNumber);
    } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
      System.out.println(secondNumber);
    } else {
      System.out.println(thirdNumber);
    }
    
  }
}
