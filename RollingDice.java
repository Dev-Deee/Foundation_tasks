import java.util.Scanner;
public class RollingDice{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first number from 1 to 6: ");
    int firstRoll = input.nextInt();

    System.out.print("Enter second number from 1 to 6: ");
    int secondRoll = input.nextInt();

    int sum = firstRoll + secondRoll;

    if(firstRoll > 6 && secondRoll > 6){
    System.out.print("OUT OF RANGE");
    }
    else{
    System.out.printf("First roll is: %d%nSecond roll is: %d%nYour total roll is  %d%n", firstRoll, secondRoll, sum);    
    }
   }
}
