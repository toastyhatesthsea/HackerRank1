package Warmup;

public class LargeSum {

    public static long aVeryBugSum(long[] anArray) {
        long answer = 0L;

        for (long aValue : anArray) {
            answer += aValue;
        }
        return answer;
    }

}
