package Hashmaps;

import java.util.HashMap;

public class TwoStrings
{
    static String twoStrings(String s1, String s2)
    {
        String answer = "NO";

        HashMap<Character, Integer> firstStrMap = new HashMap<>();

        for (Character thing : s1.toCharArray())
        {
            int value = firstStrMap.getOrDefault(thing, 0);

            firstStrMap.put(thing, 1 + value);
        }

        for (Character thing : s2.toCharArray())
        {
            int value = firstStrMap.getOrDefault(thing, 0);

            if (value != 0)
            {
                answer = "YES";
            }
        }
        return answer;

    }


}
