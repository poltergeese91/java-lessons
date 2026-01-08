import java.util.Scanner;
public class Loops{

    public static void main(String[] args)
    {
        // 3 types of controls
        //break, continue, and return

        for (int b = 0; b < 5; b++)
        {
            if (b == 2){
                continue;
            }
            System.out.println("b = " + b);

        }


        for (int i = 5; i >= 0; i--)
        {
            for (int j = 5; j >= 0; j--)
            {
                System.out.print(i + j);

            }
            System.out.print('\n');
        }
        int d = 0;
        while (d < 5){
            System.out.println(d);
            d++;
        }
        Boolean isContinuing = true;
        int l = 0;

        while (isContinuing) {
            l++;
            System.out.println(l);
            if (l >= 20){
                isContinuing = false;
            }

        }
       
        //foobar
        //1 - 100
        // i % 3 = 0
        // print foo

        // if i % 5 = 0 print bar
        //if both print foobar
        
        int v = 0;
        for (v = 1; v <= 100; v++) {
            if (v % 3 == 0) System.out.print("foo");
            if (v % 5 == 0) System.out.print("bar");
            System.out.println();
        }    

        // 2D multiplication table from 1-12

        int n = 0;
        int m = 0;
        for (n = 0; n <= 12; n++)
        {
            for (m = 0; m <= 12; m++)
            {
                System.out.print((n * m) + "\t");
            }
            System.out.println();
            System.out.println();

        }

        Scanner scanner = new Scanner(System.in);
        Boolean g = false;
        while (g == false)
        {
            System.out.println("guess which number is the correct secret number!");
            System.out.println("your numbers are 10, 20, and 30");
            int snum = 30;

            int num = Integer.parseInt(scanner.nextLine());
            
            if (num == 30)
            {
                System.out.println("you win!");
                g = true;
            } else {
                System.out.println("try again!");
            }

        }


    }

}