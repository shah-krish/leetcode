import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeIntervals {
    public static void main(String[] args) {

    }
    /*
    Case 1: If the current interval can be merged with the last inserted interval of the answer list:
In this case, we will update the end of the last inserted interval with the maximum(current interval’s end, last inserted interval’s end)
Case 2: If the current interval cannot be merged with the last inserted interval of the answer list:
In this case, we will insert the current interval in the answer array as it is.
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedIntervals = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (mergedIntervals.isEmpty() || intervals[i][0] > mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
                mergedIntervals.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                mergedIntervals.get(mergedIntervals.size() - 1)[1] = Math.max(mergedIntervals.get(mergedIntervals.size() - 1)[1], intervals[i][1]);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

