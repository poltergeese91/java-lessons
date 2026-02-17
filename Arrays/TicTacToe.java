package Arrays;
import java.util.Random;
public class TicTacToe {
    public static void main(String[] args) {
        char[][] TicTacToe = new char[3][3];
        Random r = new Random();
        int xcount = 0;
        int ocount = 0;
        for (int i = 0; i < TicTacToe.length; i++) {
            for (int j = 0; j < TicTacToe[i].length; j++) {
                int randomInt = r.nextInt(2);
                if (randomInt == 1 && xcount < 5) {
                    TicTacToe[i][j] = 'X';
                    xcount = xcount + 1;
                } else {
                    TicTacToe[i][j] = 'O';
                }
                if (randomInt == 0 && ocount < 4) {
                    TicTacToe[i][j] = 'O';
                    ocount = ocount + 1;
                } else if (xcount < 5) {
                    TicTacToe[i][j] = 'X';
                }
                System.out.println(TicTacToe[i][j]);
            }
        }
        for (int a = 0; a < TicTacToe.length; a++) {
            for (int b = 0; b < TicTacToe[a].length; b++) {
                System.out.print(TicTacToe[a][b] + " ");
            }
            System.out.println();
        }
        if (TicTacToe[0][0] == 'X' && TicTacToe[0][1] == 'X' && TicTacToe[0][2] == 'X') {
            System.out.println("X wins!");
        }
        if (TicTacToe[0][0] == 'O' && TicTacToe[0][1] == 'O' && TicTacToe[0][2] == 'O') {
            System.out.println("O wins!");
        }
        if (TicTacToe[1][0] == 'O' && TicTacToe[1][1] == 'O' && TicTacToe[1][2] == 'O') {
            System.out.println("O wins!");
        }
        if (TicTacToe[2][0] == 'O' && TicTacToe[2][1] == 'O' && TicTacToe[2][2] == 'O') {
            System.out.println("O wins!");
        }
        if (TicTacToe[0][0] == 'O' && TicTacToe[1][0] == 'O' && TicTacToe[2][0] == 'O') {
            System.out.println("O wins!");
        }
        if (TicTacToe[0][1] == 'O' && TicTacToe[1][1] == 'O' && TicTacToe[2][1] == 'O') {
            System.out.println("O wins!");
        }
        if (TicTacToe[0][2] == 'O' && TicTacToe[1][2] == 'O' && TicTacToe[2][2] == 'O') {
            System.out.println("O wins!");
        }
        if (TicTacToe[0][0] == 'O' && TicTacToe[1][1] == 'O' && TicTacToe[2][2] == 'O') {
            System.out.println("O wins!");
        }
        if (TicTacToe[2][0] == 'O' && TicTacToe[1][1] == 'O' && TicTacToe[0][2] == 'O') {
            System.out.println("O wins!");
        }
        if (TicTacToe[1][0] == 'X' && TicTacToe[1][1] == 'X' && TicTacToe[1][2] == 'X') {
            System.out.println("X wins!");
        }
        if (TicTacToe[2][0] == 'X' && TicTacToe[2][1] == 'X' && TicTacToe[2][2] == 'X') {
            System.out.println("X wins!");
        }
        if (TicTacToe[0][0] == 'X' && TicTacToe[1][0] == 'X' && TicTacToe[2][0] == 'X') {
            System.out.println("X wins!");
        }
        if (TicTacToe[0][1] == 'X' && TicTacToe[1][1] == 'X' && TicTacToe[2][1] == 'X') {
            System.out.println("X wins!");
        }
        if (TicTacToe[0][2] == 'X' && TicTacToe[1][2] == 'X' && TicTacToe[2][2] == 'X') {
            System.out.println("X wins!");
        }
        if (TicTacToe[0][0] == 'X' && TicTacToe[1][1] == 'X' && TicTacToe[2][2] == 'X') {
            System.out.println("X wins!");
        }
        if (TicTacToe[2][0] == 'X' && TicTacToe[1][1] == 'X' && TicTacToe[0][2] == 'X') {
            System.out.println("X wins!");
        }
    }
}