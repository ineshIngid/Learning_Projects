import java.util.*;

public class NumGuess {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;

        System.out.println("This is a Number Guessing Game!!!");
        System.out.println("The system will randomly pick a number between 1 and 100.");
        System.out.println("The program will guide you to the number by saying go higher or lower");

        System.out.println("Enter the number");
        int input = sc.nextInt();
        
        int tries = 0;

        while(input != number){
            if (input > number){
                System.out.println("Go lower");
                tries++;
            } else if (input < number){
                System.out.println("Go higher");
                tries++;
            }
            
            input = sc.nextInt();
        }

        System.out.println("Yes "+number+" is the correct number!!!");
        System.out.println("You guessed it in "+tries+" tries!!!");
    }
}