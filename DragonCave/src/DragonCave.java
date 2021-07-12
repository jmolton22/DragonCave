package DragonCave.src;

import java.lang.*;
import java.util.Scanner;
public class DragonCave {
    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);
        boolean gameOn = true;
        System.out.print("You are in a land full of dragons. In front of you,\n" +
                                 "\n" +
                                 "you see two caves. In one cave, the dragon is friendly\n" +
                                 "\n" +
                                 "and will share his treasure with you. The other dragon\n" +
                                 "\n" +
                                 "is greedy and hungry and will eat you on sight.\n" +
                                 "\n" +
                                 "Which cave will you go into? (1 or 2)");
        String move = playerInput.nextLine();

       while(gameOn){
           if (move.equals("0")) {
               System.exit(0);
           } else if (move.equals("1")) {
               System.out.print("You approach the cave...\n" +
                                        "\n" +
                                        "It is dark and spooky...\n" +
                                        "\n" +
                                        "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                                        "\n" +
                                        "Gobbles you down in one bite!\n" +
                                        "Game over.");
               System.exit(0);


           } else if (move.equals("2")) {
               System.out.print("You approach the cave...\n" +
                                        "\n" +
                                        "It is dark and spooky...\n" +
                                        "\n" +
                                        "But there are no dragons here! :) Choose again.");
               move = playerInput.nextLine();
           } else {
               System.out.print("Please choose cave 1 or cave 2.");
               move = playerInput.nextLine();
           }
       }
    }
}



