package HumansVSGoblins;


import java.util.Scanner;

//Driver for Human VS Goblin game
public class HumansVSGoblins {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome To Humans VS Goblins.");
        System.out.println("What is your name?");
        String name = keyboard.next();

        Humans player = new Humans();
        player.setName(name);

        System.out.println("Choose your level of difficulty: (1 2 3)");
        int level = keyboard.nextInt();

        if(level == 1){
            System.out.println("LEVEL 1");
            System.out.println("There are three goblins on the map. " +
                                       "Use keys 'n e s w' to survey the area to find them before they find you.");
            String move = keyboard.next();

            switch(move){
                case "n": System.out.println(player.getName()+", you are standing further north. " +
                                                     "There are no goblins here.");
                        break;
                case "e": System.out.println(player.getName()+", you are standing further east. " +
                                                     "There are no goblins here.");
                        break;
                case "s": System.out.println(player.getName()+", you are standing further south. " +
                                                     "There are no goblins here.");
                        break;
                case "w": System.out.println(player.getName()+", you are standing further west. " +
                                                     "There are no goblins here.");
                         break;
            }

            System.out.println("Congrats, " + player.getName() + ". You survived. Play next level? " +
                                       "(y or n)" );
            String ans = keyboard.next();
            if(ans.equalsIgnoreCase("y")){
                level++;
            }

            else{
                System.out.println("Ending game...");
                System.exit(0);
            }

            if(level ==2){
                System.out.println("Level 2");
            }
        }
    }


}
