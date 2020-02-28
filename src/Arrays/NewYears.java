package Arrays;

public class NewYears
{
    public static int newYearsChaosCalc(int[] anArray)
    {
        int answer = 0;

        for (int i = 0; i < anArray.length; i++)
        {
            int intValue = anArray[i];

            if (intValue > i)
            {
                int total = intValue - (i + 1);
                /*if (total > 2)
                {
                    return -1;
                }*/
                answer += total;
            } else if (intValue < i)
            {
                int total = (i + 1) - intValue + 1;

                if (total >= 1)
                {
                    answer += total;
                }
            }
        }
        return answer;
    }

}

class NewYearstesters
{
    public static void main(String[] asasas)
    {
        int[] anArrays = {2, 1, 5, 3, 4};
        int[] array2 = {2, 5, 1, 3, 4};

        int answer = NewYears.newYearsChaosCalc(array2);
    }
}
