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
            String move =keyboard.next();
            player.movePlayer(move);
            System.out.println("Congrats, " + player.getName() + ". You survived. Play next level? " +
                                       "(y or n)" );
            String ans = keyboard.next();
            if(ans.equalsIgnoreCase("y")){
                level++;
            }

            else{
                System.out.println("Ending game...");
                System.exit(0);
            }}

            if(level ==2){
                System.out.println("LEVEL 2");
                System.out.println("There are five goblins on the map. " +
                                           "Use keys 'n e s w' to survey the area to find them before they find you.");
                String move = keyboard.next();
                player.movePlayer(move);

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
            }

            if(level == 3){
                System.out.println("LEVEL 3");
                System.out.println("There are ten goblins on the map. " +
                                           "Use keys 'n e s w' to survey the area to find them before they find you.");
                String move = keyboard.next();
                player.movePlayer(move);

                System.out.println("Congrats, " + player.getName() + ". You survived. You beat the goblins!");
                System.out.println("Ending game...");
                System.exit(0);
                }

        }
    }



