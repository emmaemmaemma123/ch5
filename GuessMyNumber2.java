package ch3;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber2{
    public static void main(String arngs[]){
        Random random = new Random();
        int number = random.nextInt(100) + 1;
            
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(inclusive)." + " Can you guess what it is?");
        System.out.print("Type a number: ");
        
        Scanner in = new Scanner(System.in);
        int response = in.nextInt();
        if(response==number){
            System.out.println("Congratulations you guessed right!");
            return;
        } else if(response>number){
            System.out.print("Your guess is too high! Guess again: ");
        } else{
            System.out.print("Your guess is too low! Guess again: ");
        }
        Scanner in2 = new Scanner(System.in);
        int response2 = in.nextInt();
        if(response2==number){
            System.out.println("Congratulations you guessed right!");
            return;
        } else if(response2>number){
            System.out.print("Your guess is too high! Guess again: ");
        } else{
            System.out.print("Your guess is too low! Guess again: ");
        }
    
        Scanner in3 = new Scanner(System.in);
        int response3 = in.nextInt();
        if(response3==number){
            System.out.println("Congratulations you guessed right!");
        } else{
            System.out.println("The correct answer is " + number + "! Try again later...");
        }
    }
}