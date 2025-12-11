import java.util.Scanner;


public class UserInput 

{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Enter your age");
        String age = input.nextLine();
        
        int ageConverted = Integer.parseInt(age);
        System.out.println(name + " will be " + (ageConverted + 1) + " next year");

        System.out.println("Enter your height in meters");
        
        double height = Double.parseDouble(input.nextLine());
        System.out.println("your height in centimeters is " + (height * 100));
    }
}
