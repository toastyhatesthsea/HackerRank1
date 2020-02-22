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

        int[] anotherArray = new int[amountToMove];

        for (int i = 0; i < amountToMove; i++)
        {
            anotherArray[i] = anArray[i];
        }

        for (int i = amountToMove; i < anArray.length; i++)
        {
            anArray[i - amountToMove] = anArray[i];
        }

        for (int i = anArray.length - amountToMove, k=0; i < anArray.length; i++, k++)
        {
            anArray[i] = anotherArray[k];
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

    public static int[] reverseArray(int[] anArray)
    {
        return null;
    }
}

class Testers3
{
    public static void main(String[] asdasdsa)
    {
        int[] anArray = {1, 2, 3, 4, 5, 6, 7};

        Arrayrotation.rotLeft(anArray, 2);
    }
}
