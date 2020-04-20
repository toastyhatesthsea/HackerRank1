package Hashmaps;

import java.util.*;

public class Anagram
{

    public static HashMap<Integer, Boolean> fun = new HashMap<>();


    public static int solveAnagram(String s1)
    {
        HashMap<Character, ArrayList<Integer>> mapOfLocation = new HashMap<>();
        int index = 0;
        char[] str1Array = s1.toCharArray();
        int answer = 0;

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
                answer += checkForAnagram(mapOfLocation.get(thing), str1Array, index); //just get arraylist for single character
            }
            index++;
        }
        return answer;
    }

    public static int frontCheckAnagram(ArrayList<Integer> thing, char[] str1Array, int index)
    {
        int answer = 0;
        ArrayList<Integer> index1 = new ArrayList<>();
        int[] holderThing = new int[1000];
        int holderIndex = 0;
        Integer fun = 10;


        for (Integer location : thing)
        {
            String firstSubstring = "";
            String secondSubString = "";

            for (int i = location, j = index; i < index; i++, j++)
            {
                index1.add(i);
                index1.add(j);
                holderThing[holderIndex] = i;
                holderIndex++;
                holderThing[holderIndex] = j;
                holderIndex++;
                firstSubstring = firstSubstring + str1Array[i];
                secondSubString = secondSubString + str1Array[j];

                if (isAnagram(firstSubstring, secondSubString))
                {
              //      fun.put(Arrays.)
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void putInFunFun(ArrayList<Integer> thing)
    {
        Collections.sort(thing);
        for (Integer meow : thing)
        {
            //fun.put()
        }
    }

    public static int checkForAnagram(ArrayList<Integer> thing, char[] str1Array, int index)
    {
        //TODO: Need to start checking array at the first instance of the found character in the ArrayList while checking
        // At the same time as the current index of the duplicate character and work forwards/backwards checking

        int answer = 0;

        for (Integer location : thing)
        {
            String firstSubstring = "";
            String secondSubString = "";

            for (int i = location, j = index; i < index; i++, j--)
            {
                firstSubstring = firstSubstring + str1Array[i];
                secondSubString = secondSubString + str1Array[j];

                if (isAnagram(firstSubstring, secondSubString))
                {
                    answer++;
                }
            }
        }
        return answer;

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
        String fail = "cdacdxb";
        String kkkk = "kkkk";
        String cdxcd = "cdxcd";

        ArrayList<Integer> aThing = new ArrayList<>();
        ArrayList<Integer> aThing2 = new ArrayList<>();

        aThing.add(1);
        aThing.add(2);
        aThing2.add(1);
        aThing2.add(2);
        aThing2.remove(Integer.valueOf(1));
        aThing2.add(1);
        Collections.sort(aThing2);

        boolean isEqual = aThing.equals(aThing2);



        //int answer = Anagram.solveAnagram(cdxcd);

        //boolean answer = Anagram.isAnagram("anA", "ana");

        //TODO Add a hashmap where the index of the characters corresepond to the key, "0134"
    }
}
