package homeWork.RPS;

import java.util.Scanner;

public class CallingRockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char runAgain = 'y';

        while(runAgain == 'y') {
            System.out.println("Player 1 input: Rock, Paper or Scissors?");
            String player1Input = scanner.nextLine().toLowerCase().replaceAll(" ", "");
            System.out.println("Player 2 input: Rock, Paper or Scissors?");
            String player2Input = scanner.nextLine().toLowerCase().replaceAll(" ", "");


            RPS rps = new RPS();
            rps.determineGameWinner(player1Input, player2Input);

            System.out.println("Do you want to play again?y/n");
            runAgain = scanner.next().charAt(0);
            scanner.nextLine();


        }
    }
}


