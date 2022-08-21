package homeWork.RPS;

public class RPS {

    public String determineGameWinner;

    public void determineGameWinner(String player1Input, String player2Input) {
        boolean win1 = true;
        boolean win2 = true;

        if (player1Input.equals(player2Input)) {
            System.out.println("TIE");
        }if (win1 == player1Input.equals("paper") && (player2Input.equals("rock"))
                || (player1Input.equals("scissors")) && (player2Input.equals("paper"))
                || player1Input.equals("rock") && player2Input.equals("scissors")) {
                System.out.println("Player 1 wins");
        }
        if (win2 == player1Input.equals("rock") && player2Input.equals("paper")
                || player1Input.equals("paper") && player2Input.equals("scissors")
                || player1Input.equals("scissors") && player2Input.equals("rock")) {
                System.out.println("Player 2 wins");
        }
    }

}

