package Warmup;

import java.util.Scanner;

public class TimeConversion
{

    public static String timeConversion(String aStr)
    {
        String answer = "";
        Scanner aScan = new Scanner(aStr);
        aScan.useDelimiter(":");
        int count = 0;
        String hours = "";
        String minutes = "";
        String seconds = "";

        while (aScan.hasNext())
        {
            String aToken = aScan.next();

            if (count == 0)
            {
                hours = aToken;
            } else if (count == 1)
            {
                minutes = aToken;
            } else if (count == 2)
            {
                seconds = aToken;
            }
            count++;
            System.out.println(aToken);
        }

        if (seconds.charAt(2) == 'P' && !hours.equals("12"))
        {
            hours = Integer.toString(12 + Integer.parseInt(hours));
        } else if (seconds.charAt(2) == 'A' && hours.equals("12"))
        {
            hours = "00";
        }
        answer = answer.concat(hours + ":" + minutes + ":" + seconds.substring(0, 2));
        return answer;
    }
}

class MeowTesers
{
    public static void main(String[] asasasas)
    {
        String aStr = "12:45:54PM";
        String answer = TimeConversion.timeConversion(aStr);
    }
}