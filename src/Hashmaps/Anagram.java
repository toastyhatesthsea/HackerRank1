package Hashmaps;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class Anagram
{

    public static String solveAnagram(String s1)
    {
        HashMap<Character, ArrayList<Integer>> mapOfLocation = new HashMap<>();
        int index = 0;

        for (Character thing : s1.toCharArray())
        {
            ArrayList<Integer> temp = mapOfLocation.getOrDefault(thing, null);

            if (temp == null)
            {
                ArrayList<Integer> rawr = new ArrayList<>();
                rawr.add(index);
                mapOfLocation.put(thing, rawr);
            }
            else
            {
                temp.add(index);
            }
            index++;
        }
        return null;
    }
}

class AnagramTesters
{
    public static void main(String[] asasas)
    {
        String thing = "abba";

        Anagram.solveAnagram(thing);
    }
}
