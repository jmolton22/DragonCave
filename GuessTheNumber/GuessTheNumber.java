package GuessTheNumber;

import java.lang.*;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userName;
        int guess;
        int chances = 0;
        Random rand = new Random();

        int randomNumber = rand.nextInt(20);

        System.out.println("Hello, what is your name?");
             userName = userInput.nextLine();
        System.out.println("Well, " + userName + ", I am thinking of a number between 1 and 20." + "\n" +
                "Take a guess.");
             guess = userInput.nextInt();

            while(chances<6){
                 if (guess == randomNumber){
                     System.out.println("Wow. That's what I was thinking. You win.");
                     System.exit(0);}

                 else if(guess<randomNumber){
                     System.out.print("Your guess is low. Guess again.");
                     guess = userInput.nextInt();}

                 else if(guess>randomNumber){
                     System.out.print("Your guess is too high, guess again.");
                     guess = userInput.nextInt();}

                     chances++;}
            System.out.print("Game over, you lose.");
    }
}
