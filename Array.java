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

        int[] median = new int[]{13, 4, 12, 9, 9, 3};
        int len = median.length;
        if (len % 2 == 1){
            System.out.println(median[(len/2)]);
        }
        else{
            System.out.println(      ((median[len/2-1]) + (median[len/2]))/2.0        );
        }
    }
}
