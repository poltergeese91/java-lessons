import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args)
    {
    double scores[] = new double[5];
    double sum = 0.0, avg = 0.0;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the test score of 5 students");
    for(int i = 0; i < scores.length; i++) 
    {
    scores[i] = keyboard.nextInt();
    }
    System.out.println("Display the scores of 5 students");
    for(int i = 0; i < scores.length; i++) 
    {
    System.out.println(scores[i]);
    }
    for(int i = 0; i < scores.length; i++) 
    {
    sum = sum + scores[i];
    avg = sum / scores.length;
    }
    System.out.println("The average score of the students: " + avg);
}
}
