package Warmup;

import java.util.Random;

public class Hourglass
{

    public static int hourGlassSum(int[][] arrrs)
    {
        int amount = arrrs.length;
        int largest = Integer.MIN_VALUE;
        int totalHourGlassAmount = 0;
        for (int row = 0; row+2 <= arrrs.length; row++)
        {
            for (int column = 0; column+2 < arrrs[row].length; column++)
            {
                try
                {
                    totalHourGlassAmount = hourGlassHelper(arrrs, row, column);
                    if (totalHourGlassAmount > largest)
                    {
                        largest = totalHourGlassAmount;
                    }
                } catch (Exception e)
                {
                    System.err.println(e);
                }


            }
        }

        return largest;
    }


    public static int hourGlassHelper(int[][] arrrs, int row, int column)
    {
        int answer = 0;
        int topRowFirst, topRowSecond, topRowThird;
        int middleSpot;
        int bottomRowFirst, bottomRowSecond, bottomRowThird;

        try
        {
            topRowFirst = arrrs[row][column];
            topRowSecond = arrrs[row][column + 1];
            topRowThird = arrrs[row][column + 2];

            middleSpot = arrrs[row + 1][column + 1];

            bottomRowFirst = arrrs[row + 2][column];
            bottomRowSecond = arrrs[row + 2][column + 1];
            bottomRowThird = arrrs[row + 2][column + 2];

            answer = topRowFirst + topRowSecond + topRowThird + middleSpot + bottomRowFirst + bottomRowSecond + bottomRowThird;

        } catch (Exception e)
        {
            throw new NullPointerException();
            //answer = -1;
            //System.err.println(e);
        }
        return answer;
    }
}

class MeowerTests
{
    public static void main(String[] asdasd)
    {
        int[][] anArray = new int[3][3];


        for (int row = 0; row < anArray.length; row++)
        {
            for (int column = 0; column < anArray[row].length; column++)
            {

                Random ran = new Random();
                int randomNumber = ran.nextInt(20) - 20;

                anArray[row][column] = randomNumber;
            }
        }

        int answer = Hourglass.hourGlassSum(anArray);
    }
}
