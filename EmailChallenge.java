import java.util.Scanner;

public class EmailChallenge 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 words followed by 2 numbers that add up to less than 100 on separate lines");
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        String num1 = input.nextLine();
        String num2 = input.nextLine();
        int inum1 = Integer.parseInt(num1);
        int inum2 = Integer.parseInt(num2);
        
        if (inum1 + inum2 > 99)
        {
            System.out.println("numbers are too high! try again");
        }
        else{
            System.out.println("Your new email is "+ word1 + word2 + (inum1 + inum2) + "@gmail.com");

        }
        System.out.println("enter 2 numbers below on separate lines");
        double nnum1 = Double.parseDouble(input.nextLine());
        double nnum2 = Double.parseDouble(input.nextLine());
        System.out.println("Your divided number is " + (nnum1 / nnum2));

        System.out.println("write the diameter of a circle");
        double gnum1 = Double.parseDouble(input.nextLine());
        double radius = gnum1/2;
        double area = Math.PI * Math.pow(radius, 2.0);
        System.out.println(area);

    }
    
}
