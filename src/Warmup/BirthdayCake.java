package Warmup;

public class BirthdayCake
{
    public static int birthdayCakeCandles(int[] arrr)
    {
        int largest = Integer.MIN_VALUE;
        int totalCut = 0;

        for (int value : arrr)
        {
            if (value > largest)
            {
                largest = value;
                totalCut = 0;
            }
            if (value == largest)
            {
                totalCut++;
            }
        }
        return totalCut;
    }
}
