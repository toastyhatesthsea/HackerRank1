package Warmup;

import java.util.ArrayList;
import java.util.List;

public class Triplets {


    public static List<Integer> compareTriplets(List<Integer> aList, List<Integer> bList) {
        ArrayList<Integer> answer = new ArrayList<>();
        int aTotal = 0;
        int bTotal = 0;

        for (int i = 0; i < aList.size(); i++) {
            int aValue = aList.get(i);
            int bValue = bList.get(i);

            if (aValue < bValue) {
                bTotal += 1;
            } else if (aValue > bValue) {
                aTotal += 1;
            }
        }
        answer.add(aTotal);
        answer.add(bTotal);
        return answer;
    }
}

class Testers1
{
    public static void main(String[] asdasd) {
        ArrayList<Integer> intA = new ArrayList<>();
        ArrayList<Integer> intB = new ArrayList<>();

        intA.add(17);
        intA.add(28);
        intA.add(30);

        intB.add(99);
        intB.add(16);
        intB.add(8);

        List<Integer> answer = Triplets.compareTriplets(intA, intB);
    }
}
