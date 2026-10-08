import java.util.Scanner;

public class RockPaperScissor {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String playerA;
        String playerB;

        String rock = "R";
        String paper = "P";
        String scissor = "S";
        String continueOption;

        boolean contContinue = false;
        boolean isValid = false;

        do{
            contContinue = false;
            do {
                System.out.println("User A Choose [Rock(R) Paper(P) Scissor(S)] ");

                playerA = scan.nextLine();

                if(playerA.equalsIgnoreCase(rock) || playerA.equalsIgnoreCase(paper) || playerA.equalsIgnoreCase(scissor)){
                    contContinue = true;
                } else {
                    System.out.println("Error: Input must be Rock(R) Paper(P) Scissor(S) ");
                }
            } while (!contContinue);

            contContinue = false;

            do {
                System.out.println("User B Choose [Rock(R) Paper(P) Scissor(S)] ");

                playerB = scan.nextLine();

                if(playerB.equalsIgnoreCase(rock) || playerB.equalsIgnoreCase(paper) || playerB.equalsIgnoreCase(scissor)){
                    contContinue = true;
                } else {
                    System.out.println("Error: Input must be Rock(R) Paper(P) Scissor(S) ");
                }
            } while (!contContinue);

            contContinue = false;

            if (playerA.equalsIgnoreCase(playerB) ) {
                System.out.println("The game ends in a tie!");
            } else if(playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(scissor) ) {
                System.out.println("Rock breaks Scissors. Player A wins! ");
            } else if(playerA.equalsIgnoreCase(scissor) && playerB.equalsIgnoreCase(rock) ) {
                System.out.println("Rock breaks Scissors. Player B wins! ");
            } else if (playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(rock) ) {
                System.out.println("Paper covers Rock. Player A wins! ");
            } else if(playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(paper) ) {
                System.out.println("Paper covers Rock. Player B wins! ");
            } else if(playerA.equalsIgnoreCase(scissor) && playerB.equalsIgnoreCase(paper) ) {
                System.out.println("Scissors cuts Paper. Player A wins! ");
            } else {
                System.out.println("Scissors cuts Paper. Player B wins! ");
            }

            isValid = false;

            do {
                System.out.println("Would you like to continue? Type Y or N: ");

                continueOption = scan.nextLine();

                if(continueOption.equalsIgnoreCase("Y" ) || continueOption.equalsIgnoreCase("N")) {
                    isValid = true;
                } else {
                    System.out.println("Error. You need to type in Y or N ");
                }
            } while(!isValid);


            if(continueOption.equalsIgnoreCase("Y")){
                contContinue = true;
            }
        } while(contContinue);
    }
}
