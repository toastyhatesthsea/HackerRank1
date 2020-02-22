package Warmup;

public class Arrayrotation
{

    public static int[] rotLeft(int[] anArray, int rotationAmount)
    {
        int amountToMove = rotationAmount % anArray.length;

        if (amountToMove == 0)
        {
            return anArray;
        }

        for (int i = 0; i < anArray.length; i++)
        {
            int newLocation = anArray.length - amountToMove + i;
            if (newLocation >= anArray.length)
            {
                newLocation = newLocation - anArray.length;
            }
            int holder = anArray[newLocation];
            anArray[newLocation] = anArray[i];
            anArray[i] = holder;
        }
        return anArray;
    }

    public static int[] moveLeftOnce(int[] anArray)
    {
        int holder;
        for (int i = 0; i < anArray.length; i++)
        {
            holder = anArray[i];
            int temp = anArray[0];
        }
        return null;
    }
}

class Testers3
{
    public static void main(String[] asdasdsa)
    {
        int[] anArray = {1, 2, 3, 4, 5, 6, 7};

        Arrayrotation.rotLeft(anArray, 1);
    }
}
