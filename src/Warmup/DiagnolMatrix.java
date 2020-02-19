package Warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagnolMatrix {


    public static int diagonalDifference(List<List<Integer>> anArray) {

        int firstIndex = 0;
        int secondIndex = anArray.size() - 1;
        Integer totalFirstDiag = 0;
        Integer totalSecondDiag = 0;
        for (List aList : anArray) {

            try {
                //ArrayList<Integer> someList = (ArrayList<Integer>)aList.get(0);
                //Integer[] theList = (Integer[])aList.get(firstIndex);
                totalFirstDiag += (Integer) aList.get(firstIndex);
                totalSecondDiag += (Integer) aList.get(secondIndex);
            } catch (Exception e) {
                System.err.println(e);
            }
            firstIndex++;
            secondIndex--;
        }

        return Math.abs(totalFirstDiag - totalSecondDiag);
    }
}

class Meowers {
    public static void main(String[] asfadasd) {
        int[] anArray = {11, 2, 4};
        int[] secondArray = {4, 5, 6};
        int[] thirdArray = {10, 8, -12};
        List<Integer> aList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        List<Integer> thirdList = new ArrayList<>();
        aList.add(11);
        aList.add(2);
        aList.add(4);

        secondList.add(4);
        secondList.add(5);
        secondList.add(6);

        thirdList.add(10);
        thirdList.add(8);
        thirdList.add(-12);

        List<List<Integer>> totalList = new ArrayList<>();


        totalList.add(aList);
        totalList.add(secondList);
        totalList.add(thirdList);

        int difference = DiagnolMatrix.diagonalDifference(totalList);
    }
}
