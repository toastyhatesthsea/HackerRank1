package Hashmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;

public class Anagram
{

    public static String solveAnagram(String s1)
    {
        HashMap<Character, ArrayList<Integer>> mapOfLocation = new HashMap<>();
        int index = 0;
        char[] str1Array = s1.toCharArray();

        for (Character thing : str1Array)
        {
            ArrayList<Integer> temp = mapOfLocation.getOrDefault(thing, null);

            if (temp == null)
            {
                ArrayList<Integer> rawr = new ArrayList<>();
                rawr.add(index);
                mapOfLocation.put(thing, rawr);
            } else
            {
                temp.add(index);
            }
            index++;
        }
        return null;
    }

    public static int checkForAnagram(HashMap<Character, ArrayList<Integer>> thing, char[] str1Array, int index)
    {
        //TODO: Need to start checking array at the first instance of the found character in the ArrayList while checking
        // At the same time as the current index of the duplicate character and work forwards/backwards checking
    }


    public static boolean isAnagram(String str1, String str2)
    {
        char[] str1Array = str1.toLowerCase().toCharArray();
        Arrays.sort(str1Array);

        char[] str2Array = str2.toLowerCase().toCharArray();
        Arrays.sort(str2Array);

        return Arrays.equals(str1Array, str2Array);
    }
}

class AnagramTesters
{
    public static void main(String[] asasas)
    {
        String thing = "abba";
        String fail = "ifailuhkgg";

        //Anagram.solveAnagram(fail);

        boolean answer = Anagram.isAnagram("anA", "ana");
    }
}
