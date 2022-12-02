import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (true)
        {

            String player1;
            String player2;

            while (true)
            {
                System.out.println("Enter Player 1 Move (R, P, or S)");
                player1 = in.nextLine();
                if (player1.equalsIgnoreCase("r") || player1.equalsIgnoreCase("p") || player1.equalsIgnoreCase("s"))
                {
                    break;
                }
                System.out.println(player1 + " is not a valid move");
            }

            while (true)
            {
                System.out.println("Enter Player 2 Move (R, P, or S)");
                player2 = in.nextLine();
                if (player2.equalsIgnoreCase("r") || player2.equalsIgnoreCase("p") || player2.equalsIgnoreCase("s"))
                {
                    break;
                }
                System.out.println(player1 + " is not a valid move");
            }

            if (player1.equalsIgnoreCase(player2))
            {
                System.out.println(player1 + " vs " + player2 + " it's a tie!");
            } else if (player2.equalsIgnoreCase("r"))
            {
                if (player1.equalsIgnoreCase("p"))
                {
                    System.out.println("Paper covers rock, Player 2 Wins!");
                }
                else if (player1.equalsIgnoreCase("s"))
                {
                    System.out.println("Rock breaks scissors, Player 2 Wins!");
                }
            } else if (player2.equalsIgnoreCase("p"))
            {
                if (player1.equalsIgnoreCase("r"))
                {
                    System.out.println("Paper covers rock, Player 2 Wins!");
                }
                else if (player1.equalsIgnoreCase("s"))
                {
                    System.out.println("Scissors cuts paper, Player 1 Wins!");
                }
            }
            else if (player2.equalsIgnoreCase("s"))
            {
                if (player1.equalsIgnoreCase("p"))
                {
                    System.out.println("Scissors cuts paper. Player 2 Wins");
                } else if (player1.equalsIgnoreCase("r"))
                {
                    System.out.println("Rock breaks scissors, Player 1 wins");
                }
            }
            System.out.println("Do you want to play again? Enter y or n: ");
            String playAgain = in.nextLine();
            if (!playAgain.equalsIgnoreCase("y"))
            {
                break;
            }
        }
    }

}
