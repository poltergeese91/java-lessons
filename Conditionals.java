import java.util.Scanner;
public class Conditionals
{
    public static void main(String[] args)
    {
        System.out.println("Double equals: " + (3 == 2));
        System.out.println("String equivalent: " + "Hello".equals("Hi there"));
        System.out.println("not equals: " + (7 != 8));
        System.out.println("greater than: " + (4 < 5));


        int num = 11;
        System.out.println(num <= 12);

        if (num <= 12)
        {
            System.out.println("your number is less than or equal to 12");

        } else
        {
            System.out.println("your number is greater than 12");

        }
            int temperature = 93;
            if (temperature >= 85) {
                System.out.println("It's hot!");
            } else if (temperature >= 60 ){
                 System.out.println("It's nice!");       
            } else if (temperature < 40) {
                System.out.println("It's cold!"); 
            } else {
                System.out.println("ERROR!");
            }
        

        int age = 17;
        boolean hasPermit = true;

        if (age >= 17 && hasPermit == true)
        {
            System.out.println("you can drive");
        } else
        {
            System.out.println("you can't drive");

        }
         String day = "Saturday";

            if (day.equals("Saturday") || day.equals("Sunday")) {
                System.out.println("It's the weekend!");
            } else if (day.equals("Monday") || 
            day.equals("Tuesday") || 
            day.equals("Wednesday") || 
            day.equals("Thursday") || 
            day.equals("Friday") ) {
                System.out.println("its the weekday");
            }else{
                System.out.println("that is not a day");
            }
                

            String pass = "george";
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Enter the password george");
            String upass = Scanner.nextLine();

            if (upass.equals(pass))
            {
                System.out.println("correct!");
            } else {
                System.out.println("incorrect!");
            }

            
            
          
    }
    
}
