package Hangman;

import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String keyword = null;
        int blankSpace = 3;
        int chances = 0;
        ArrayList <Integer> place = new ArrayList<>();
        boolean gameOn = true;
        int whichBlank = 0;
        ArrayList<Object> missedLetters = new ArrayList<>();

       
        words.add("cat");
        words.add("dog");
        words.add("rat");
        words.add("hat");
        words.add("mom");
        words.add("dad");
        words.add("pop");
        words.add("gag");
        words.add("hog");
        words.add("dig");

        for(int i = 0; i<=words.size(); i++){
          int  randomIndex = (int)(Math.random() * words.size());
            keyword = words.get(randomIndex);
        }

            System.out.println("HANGMAN");
            System.out.println("+---+");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("  ===");
            System.out.println("Missed letters:");
            System.out.println("___");
            System.out.println("Guess a letter.");

          //get player guess
           String guess = keyboard.next();

           //stores keyword as a character array to compare to guesses
           ArrayList<Character> keywordArray = new ArrayList<>();

           //fills keyword array
        for(int i=0; i<=keyword.length()-1; i++){
                keywordArray.add(keyword.charAt(i));
            }
            //array to hold blanks/guesses
            char [] answer = new char [keywordArray.size()];
            answer[0] = '_';
            answer[1] = '_';
            answer[2] = '_';


             while(gameOn) {
                 if (keywordArray.contains(guess.charAt(0))) {
                System.out.println("Congrats, that is one of the letters!");

                //updating answer array for correct guess
                    for (int i = 0; i <= keywordArray.size() - 1; i++) {
                        if (keywordArray.get(i) == guess.charAt(0)) {
                        place.add(i);
                        blankSpace--;}}

                    for (int i = 0; i <= place.size() - 1; i++) {
                        whichBlank = place.get(i);

                        switch (whichBlank) {

                                case 0:
                                    if (keywordArray.get(0) == guess.charAt(0))
                                    answer[0] = guess.charAt(0);


                                case 1:
                                    if (keywordArray.get(1) == guess.charAt(0))
                                    answer[1] = guess.charAt(0);

                                case 2:
                                    if (keywordArray.get(2) == guess.charAt(0))
                                    answer[2] = guess.charAt(0);



                    }}}


                     else if (!(keywordArray.contains(guess.charAt(0)))) {
                         chances++;
                         System.out.println("Sorry, that's not one of them.");
                         missedLetters.add(guess.charAt(0));

                         switch (chances) {
                             case 1:
                                 System.out.println("+---+");
                                 System.out.println("  o");
                                 System.out.println("   |");
                                 System.out.println("   |");
                                 System.out.println("   |");
                                 System.out.println("  ===");
                                 break;


                             case 2:
                                 System.out.println("+---+");
                                 System.out.println("  o");
                                 System.out.println("  | |");
                                 System.out.println("    |");
                                 System.out.println("    |");
                                 System.out.println("  ===");
                                 break;

                             case 3:
                                 System.out.println("+---+");
                                 System.out.println("\\ o");
                                 System.out.println("  | |");
                                 System.out.println("    |");
                                 System.out.println("    |");
                                 System.out.println("  ===");
                                 break;

                             case 4:
                                 System.out.println("+---+");
                                 System.out.println("\\ o" + "\t/" + " |");
                                 System.out.println("      |");
                                 System.out.println("      |");
                                 System.out.println("  ===");
                                 break;

                             case 5:
                                 System.out.println("+---+");
                                 System.out.println("\\ o" + " /" + "|");
                                 System.out.println("  |" + "\t |");
                                 System.out.println(" /"+"\t |");

                                 System.out.println("   ===");
                                 break;

                             case 6:
                                 System.out.println("+---+");
                                 System.out.println("\\ o" + "\t/" + " |");
                                 System.out.println("  |"+"\t  |");
                                 System.out.println(" /" + "\t\\ |");
                                 System.out.println("    ===");
                                 break;

                         }

                 }
                            if((blankSpace<=0)||(chances==6))
                                break;
                 for(int j = 0; j <= answer.length - 1; j++) {
                     System.out.print(answer[j]);
                 }
                 System.out.print("\nMissed letters: " + missedLetters);
                    //print statement for updated guess

                    System.out.println("\nGuess again.");
                    guess = keyboard.next();

                }

        for (int i = 0; i <= answer.length-1; i++) {
            System.out.print(answer[i]);}

           if(blankSpace ==0) { System.out.println("\nGame over you win!");}
           else if(chances ==6){System.out.println("\nGame over.");
                    System.out.println("The word was " + keyword + ".");}
    }}






