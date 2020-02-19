package Warmup;

public class Staircase
{
    /**
     * Prints out staircase in the shape of ****
     * @param n size of staircase
     */
    public static void staircaseSolution(int n)
    {
        String answer = "";

        for (int i = 1, j = n - 1; i <= n; i++, j--)
        {
            answer = computeOneFloor(i, j);
            System.out.println(answer);
            //System.out.println();

        }

    }

    private static String computeOneFloor(int n, int amountOfSpaces)
    {
        String answer = "";
        answer = answer.concat(computeSpaces(amountOfSpaces));

        for (int i = 1; i <= n; i++)
        {
            answer = answer.concat("#");
            //System.out.println(answer);
        }
        return answer;
    }

    private static String computeSpaces(int n)
    {
        String answer = "";

        for (int i = 1; i <= n; i++)
        {
            answer = answer.concat(" ");
        }
        return answer;
    }

}

class Test1
{
    public static void main(String[] asdasdasdsa)
    {
        Staircase.staircaseSolution(6);
    }
}