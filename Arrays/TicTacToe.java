package Arrays;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
   public static void main(String[] args)
   {
        char[][] TicTacToe = new char[3][3];
        Random r = new Random();
        int xcount = 0;
        int ocount = 0;
        for (int i = 0; i < TicTacToe.length;i++)
        {
            for (int j = 0; j < TicTacToe[i].length;j++)
            {
                int randomInt = r.nextInt(2);
            
            
                if (randomInt == 1 && xcount < 5){              
                    TicTacToe[i][j] = 'X';
                    xcount = xcount+1;
            }else
                { TicTacToe[i][j] = 'O';
            }
            if (randomInt == 0 && ocount < 4){
                   TicTacToe[i][j] = 'O';
                   ocount = ocount+1;
            }else if(xcount < 5)
                { TicTacToe[i][j] = 'X';
}
                System.out.println(TicTacToe[i][j]);
            }
        }


        for (int a = 0; a < TicTacToe.length; a++)
        {
            for (int b = 0; b < TicTacToe[a].length; b++)
            { 
                System.out.print(TicTacToe[a][b] + " ");
            }
            System.out.println();
        }

        for (int c = 0; c < TicTacToe.length; c++)
        {
            for (int d = 0; d < TicTacToe[c].length; d++)
            {


            }

        }

   }
}
