package Warmup;

public class Valleys
{

    public static int countingValleys(int n, String aStr)
    {
        int currentLevel = 0;
        int total = 0;

        for (int i = 0; i < aStr.length(); i++)
        {
            char direction = aStr.charAt(i);

            if (direction == 'D')
            {
                if (currentLevel == 0)
                {
                    total++;
                }

                currentLevel = currentLevel - 1;
            } else
            {
                currentLevel += 1;
            }
        }
        return total;
    }
}

class Meowsers
{
    public static void main(String[] asdasdasdsa)
    {
        String aStr = "UDDDUDUU";
        Valleys.countingValleys(8, aStr);
    }
}
