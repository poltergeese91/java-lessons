package Arrays;
import java.util.Scanner;

public class ArrayPractice 
{
    public static void main(String[] args)
    {
       // int[] array = {27, 3, 4, 5, 19, -6, 12, 6};
       // int min = array[0];
       // for (int index = 0; index < array.length; index++)
        //{
       //     if (array[index] < min)
       //         min = array[index];
        //}
        //System.out.println("The minimum of this array is " + min);

        //int target = 5;
        //int[] numbers = {0, 2, 4, 6, 8};
        //boolean targetFound = false;
//
        //for (int i=0; i < numbers.length; i++ )
        //{
        //    if (numbers[i] == target)
        //    {
        //        targetFound = true;
        //        break;
        //    }
        //}
        //System.out.println("target found: "+targetFound);

       // int[] nums = { 0, 0, 0, 0, 0 };
       // boolean allSame = true;
       // for (int index = 1; index < nums.length; index++) {
      //      if (nums[0] != nums[index]) {
      //          allSame = false;
      //          break;
      //      }
      //  }
      //  System.out.println("ALGO 3 - All elements the same? " + allSame);
      //  
       // String[] people = {"George", "Jill", "Xinyi", "Ravi"};
//
       // for (String indx : people)
        //{
        //    System.out.print(indx + (", "));
        //}
        //public class StudentScores {
    double scores[] = new double[10];
    double sum = 0.0, avg = 0.0;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter scores of 10 students");
    for(int i = 0; i < scores.length; i++) 
    {
    scores[i] = keyboard.nextInt();
    }
    System.out.println("Display the scores of 10 students");
    for(int i = 0; i < scores.length; i++) 
    {
    System.out.println(scores[i]);
    }
    for(int i = 0; i < scores.length; i++) 
    {
    sum = sum + scores[i];
    avg = sum / scores.length;
    }
    System.out.println("The average score of the class: " + avg);
    }
}

