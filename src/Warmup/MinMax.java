package Warmup;

import java.util.Arrays;

public class MinMax
{

    public static void calcMinMax(int[] arrrrr)
    {
        Arrays.sort(arrrrr);
        long max = 0;
        long min = 0;

        for (int i = 0; i < arrrrr.length; i++)
        {
            if (i == 0)
            {
                min += arrrrr[i];
            } else if (i == arrrrr.length - 1)
            {
                max += arrrrr[i];
            } else
            {
                min += arrrrr[i];
                max += arrrrr[i];
            }
        }
        System.out.println(min + " " + max);
    }

}

class MeowTesters
{
    public static void main(String[] arsrsr)
    {
        int[] anArray = {1, 2, 3, 4, 5};
        MinMax.calcMinMax(anArray);
    }
}
