package Warmup;

public class PlusMinus
{

    public static void plusMinusThing(int[] arrsss)
    {
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (int aValue : arrsss)
        {
            if (aValue < 0)
            {
                negative++;
            } else if (aValue > 0)
            {
                positive++;
            }
            else
            {
                zero++;
            }
        }
        positive = positive / arrsss.length;
        negative = negative / arrsss.length;
        zero = zero / arrsss.length;

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }

}

class Rawrers
{
    public static void main(String[] asdasdasd)
    {
        int[] meowmeows = {-4, 3, -9, 0, 4, 1};

        PlusMinus.plusMinusThing(meowmeows);
    }
}