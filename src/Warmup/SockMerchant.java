package Warmup;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant
{

    static int sockMerchantCalc(int n, int[] ar) {
        int totalPairs = 0;

        HashMap<Integer, Integer> totals = new HashMap<>();
        int value = 0;

        for (int key : ar)
        {
            try
            {
                value = totals.getOrDefault(key, 0);
            } catch (Exception e)
            {

            }
            totals.put(key, value + 1);
        }

        for (Map.Entry<Integer, Integer> aKey : totals.entrySet())
        {
            int pairs = aKey.getValue() / 2;
            totalPairs += pairs;
        }
        return totalPairs;

    }
}

class TestersTest
{
    public static void main(String[] asdasdasd)
    {
        int[] socks = {1, 1, 1, 2, 3, 1, 3, 3};

        SockMerchant.sockMerchantCalc(socks.length, socks);
    }
}
