import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Main
 */
public class Main 
{
    static Scanner in;
    static String turn;

    public static void main(String[] args) {

        in = new Scanner(System.in);
        turn = "X";
        String winner = null;

        TicTacToe obj = new TicTacToe();
        obj.populateEmptyBoard();

        System.out.println("Welcome to 2 Player Tic Tac Toe.");
        System.out.println("--------------------------------");
        obj.printBoard();
        System.out.println("X's will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input2; re-enter slot number:");
                continue;
            }
            if (TicTacToe.board[numInput - 1].equals(String.valueOf(numInput))) {
                TicTacToe.board[numInput - 1] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                obj.printBoard();
                winner = obj.checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
                continue;
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
    }
}