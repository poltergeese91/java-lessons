public class Array 
{
    public static void main(String[] args)
    {

        int[] price = new int[]{1,1,1,1,1,1,1,1,1,1};
        for (int i=0;i < price.length;i++)
            System.out.println(price[i]);

        int[] numbers = new int[20];
        for (int j=0; j < numbers.length;j++)
        {
            numbers[j] = numbers[j] + 4;
            System.out.println(numbers[j]);
            
        }
    }
}
