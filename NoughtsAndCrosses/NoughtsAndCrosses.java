package NoughtsAndCrosses;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class NoughtsAndCrosses {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String playerMove;
        String computerMove = "O";
        String[] whichSquare = {"1", "2","3","4","5","6","7","8","9"};
        ArrayList<String> first = new ArrayList<>();
        ArrayList<String> second = new ArrayList<>();
        ArrayList<String> third = new ArrayList<>();
        ArrayList<String> fourth = new ArrayList<>();
        ArrayList<String> fifth = new ArrayList<>();
        ArrayList<String> sixth = new ArrayList<>();
        ArrayList<String> seventh = new ArrayList<>();
        ArrayList<String> eighth = new ArrayList<>();

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Do you want to be X or O?");

      //assigns X and O
        StringBuilder playerMoveBuilder = new StringBuilder();
        while (playerMoveBuilder.length() == 0) {
            String input = keyboard.next();
            if (input.equalsIgnoreCase("x") || input.equalsIgnoreCase("o")) {
                playerMoveBuilder.append(input.toUpperCase());
            } else {
                System.out.println("Please choose X or O.");
            }
        }
        playerMove = playerMoveBuilder.toString();

        if (playerMove.equals(computerMove)) {
            computerMove = "X";
        }

        System.out.println("The computer will go first.");


        String[] firstRow = {"\t", " ", "|", "  ", "|", " "};
        String[] secondRow = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        String[] thirdRow = {"\t", " ", "|", "  ", "|", " "};
        String[] fourthRow = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        String[] fifthRow = {"\t", " ", "|", "  ", "|", " "};

        int maxCompMoves = 0;

           //prints board with first move

            String place;
                while(maxCompMoves<=5) {
                    int randPlace = new Random().nextInt(whichSquare.length );

                    if((whichSquare[randPlace].equals("1")) && ((!firstRow[1].equals(playerMove))&&(!firstRow[1].equals(computerMove))))
                        firstRow[1] = computerMove;
                    else if((whichSquare[randPlace].equals("2")) && ((!firstRow[3].equals(playerMove))&&(!firstRow[3].equals(computerMove))))
                        firstRow[3] = computerMove;
                    else if((whichSquare[randPlace].equals("3")) && ((!firstRow[5].equals(playerMove))&&(!firstRow[5].equals(computerMove))))
                        firstRow[5] = computerMove;
                    else if((whichSquare[randPlace].equals("4")) && ((!thirdRow[1].equals(playerMove))&&(!thirdRow[1].equals(computerMove))))
                        thirdRow[1] = computerMove;
                    else if((whichSquare[randPlace].equals("5")) && ((!thirdRow[3].equals(playerMove))&&(!thirdRow[3].equals(computerMove))))
                        thirdRow[3] = computerMove;
                    else if((whichSquare[randPlace].equals("6")) && ((!thirdRow[5].equals(playerMove))&&(!thirdRow[5].equals(computerMove))))
                        thirdRow[5] = computerMove;
                    else if((whichSquare[randPlace].equals("7")) && ((!fifthRow[1].equals(playerMove))&&(!fifthRow[1].equals(computerMove))))
                        fifthRow[1] = computerMove;
                    else if((whichSquare[randPlace].equals("8")) && ((!fifthRow[3].equals(playerMove))&&(!fifthRow[3].equals(computerMove))))
                        fifthRow[3] = computerMove;
                    else if((whichSquare[randPlace].equals("9")) && ((!fifthRow[5].equals(playerMove))&&(!fifthRow[5].equals(computerMove))))
                        fifthRow[5] = computerMove;


                    for (var symbol : firstRow) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                    for (var symbol : secondRow) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                    for (var symbol : thirdRow) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                    for (var symbol : fourthRow) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                    for (var symbol : fifthRow) {
                        System.out.print(symbol);
                    }
                    System.out.println();
                    System.out.println("Choose your square. 1-9.");
                    place = keyboard.next();

                    switch (place) {

                        case "1":

                            if (!(firstRow[1].equals(computerMove)) && !(firstRow[1].equals(playerMove))) {
                                firstRow[1] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");
                            }
                            first.add(firstRow[1]);
                            eighth.add(firstRow[1]);
                            fourth.add(firstRow[1]);
                            break;


                        case "2":

                            if (!(firstRow[3].equals(computerMove)) && !(firstRow[3].equals(playerMove))) {
                                firstRow[3] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");
                            }
                            first.add(firstRow[3]);
                            fifth.add(firstRow[3]);
                            break;

                        case "3":
                            if (!(firstRow[5].equals(computerMove)) && !(firstRow[5].equals(playerMove))) {
                                firstRow[5] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");

                            }
                            first.add(firstRow[5]);
                            sixth.add(firstRow[5]);
                            seventh.add(firstRow[5]);

                            break;

                        case "4":

                            if (!(thirdRow[1].equals(computerMove)) && !(thirdRow[1].equals(playerMove))) {
                                thirdRow[1] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");

                            }
                            second.add(thirdRow[1]);
                            fourth.add(thirdRow[1]);
                            break;

                        case "5":

                            if (!(thirdRow[3].equals(computerMove)) && !(thirdRow[3].equals(playerMove))) {
                                thirdRow[3] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");

                            }
                            fifth.add(thirdRow[3]);
                            eighth.add(thirdRow[3]);
                            seventh.add(thirdRow[3]);
                            second.add(thirdRow[3]);
                            break;

                        case "6":

                            if (!(thirdRow[5].equals(computerMove)) && !(thirdRow[5].equals(playerMove))) {
                                thirdRow[5] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");

                            }

                            second.add(thirdRow[5]);
                            sixth.add(thirdRow[5]);
                            break;

                        case "7":
                            if (!(fifthRow[1].equals(computerMove)) && !(fifthRow[1].equals(playerMove))) {
                                fifthRow[1] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");

                            }
                            seventh.add(fifthRow[1]);
                            fourth.add(fifthRow[1]);
                            third.add(fifthRow[1]);
                            break;

                        case "8":
                            if (!(fifthRow[3].equals(computerMove)) && !(fifthRow[3].equals(playerMove))) {
                                fifthRow[3] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");

                            }
                            third.add(fifthRow[3]);
                            fifth.add(fifthRow[3]);
                            break;

                        case "9":
                            if (!(fifthRow[5].equals(computerMove)) && !(fifthRow[5].equals(playerMove))) {
                                fifthRow[5] = playerMove;
                            } else {
                                System.out.println("This seat is taken.");
                                System.out.println("Choose again.");

                            }
                            sixth.add(fifthRow[5]);
                            eighth.add(fifthRow[5]);
                            third.add(fifthRow[5]);
                            break;
                    }
                    maxCompMoves++;

        //game ending scenarios
        ArrayList<ArrayList<String>> winningScenars = new ArrayList<>();

        winningScenars.add(first);
        winningScenars.add(second);
        winningScenars.add(third);
        winningScenars.add(fourth);
        winningScenars.add(fifth);
        winningScenars.add(sixth);
        winningScenars.add(seventh);
        winningScenars.add(eighth);

        ArrayList<String> xWon = new ArrayList<>();
        xWon.add("X");
        xWon.add("X");
        xWon.add("X");

        ArrayList<String> oWon = new ArrayList<>();
        oWon.add("O");
        oWon.add("O");
        oWon.add("O");

        for(var elms : winningScenars){
            if (elms.equals(xWon)) {
                System.out.println("X's win!");
                for (var symbol : firstRow) {
                    System.out.print(symbol);
                }
                System.out.println();
                for (var symbol : secondRow) {
                    System.out.print(symbol);
                }
                System.out.println();
                for (var symbol : thirdRow) {
                    System.out.print(symbol);
                }
                System.out.println();
                for (var symbol : fourthRow) {
                    System.out.print(symbol);
                }
                System.out.println();
                for (var symbol : fifthRow) {
                    System.out.print(symbol);
                }
                System.exit(0);
            }
            else if(elms.equals(oWon)){
                System.out.println("O's win!");
                for (var symbol : firstRow) {
                    System.out.print(symbol);
                }
                System.out.println();
                for (var symbol : secondRow) {
                    System.out.print(symbol);
                }
                System.out.println();
                for (var symbol : thirdRow) {
                    System.out.print(symbol);
                }
                System.out.println();
                for (var symbol : fourthRow) {
                    System.out.print(symbol);
                }
                System.out.println();
                for (var symbol : fifthRow) {
                    System.out.print(symbol);
                }
                System.exit(0);
            }

        }
       }
                System.out.println("It's a tie.");
    }}

