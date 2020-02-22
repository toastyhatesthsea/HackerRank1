package Warmup;

import java.util.Arrays;

public class RepeatedStrings
{

    public static long repeatedString(String aStr, long n)
    {
        long count = 0L;
        int location = 0;

        //Small amounts and strings of only size 1
        if (aStr.length() == 1 && aStr.equals("a"))
        {
            if (!aStr.equals("a"))
            {
                return 0;
            }
            return n;
        }

        char[] strArray = aStr.toCharArray();
        long totalInSinglePass = 0L;

        //Just returns amount of size that is less than total string size
        if (n < aStr.length())
        {
            totalInSinglePass = howManyCharsInArray(strArray, 'a', n);

            return totalInSinglePass;
        }
        totalInSinglePass = howManyCharsInArray(strArray, 'a', strArray.length);

        long multiples = n / aStr.length();
        long estimateAmount = multiples * totalInSinglePass;

        long leftOver = n - multiples * aStr.length();

        if (leftOver == 0)
        {
            return estimateAmount;
        } else
        {
            long totalLeft = 0l;
            for (int i = 0; i < leftOver; i++)
            {
                if (strArray[i] == 'a')
                {
                    totalLeft++;
                }
            }
            estimateAmount += totalLeft;
            return estimateAmount;
        }

        /*
        //Arrays.sort(strArray);

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
        */
    }

    private static long howManyCharsInArray(char[] array, char findThisChar, long size)
    {
        long total = 0l;

        for (int i = 0; i < array.length && i < size; i++)
        {
            if (array[i] == findThisChar)
            {
                total++;
            }
        }
        return total;
    }
}

class Testers2
{
    public static void main(String[] asdasdasdsad)
    {
        long amount = RepeatedStrings.repeatedString("udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps", 872514961806L);
    }
}