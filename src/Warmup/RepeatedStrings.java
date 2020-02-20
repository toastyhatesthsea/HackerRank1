package Warmup;

public class RepeatedStrings
{

    public static long repeatedString(String aStr, long n)
    {
        long count = 0L;
        int location = 0;

        if (aStr.length() == 1)
        {
            return n;
        }

        for (int i = 0; i < n; i++)
        {
            if (location >= aStr.length())
            {
                //aStr = aStr.concat(aStr);
                location = 0;
            }

            if (aStr.charAt(location) == 'a' || aStr.charAt(location) == 'A')
            {
                count++;
            }
            location++;
        }
        return count;
    }
}

class Testers2
{
    public static void main(String[] asdasdasdsad)
    {
        long amount = RepeatedStrings.repeatedString("a", 1000000000000L);
    }
}