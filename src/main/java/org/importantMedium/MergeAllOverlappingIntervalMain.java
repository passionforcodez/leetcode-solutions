package org.importantMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeIntervalSolutions {
    public List<int[]> merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new ArrayList<>();
        }
        // Sort the intervals by the starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        // Initialize the first interval as the initial merged interval
        int[] current = intervals[0];
        merged.add(current);

        // Iterate through the remaining intervals and merge if needed
        for (int i= 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if(interval[0] <= current[1]) {
                current[1] = Math.max(current[1], interval[1]);
            } else {
                current = interval;
                merged.add(current);
            }
        }
        return merged;
    }
}
public class MergeAllOverlappingIntervalMain {
    public static void main(String[] args){
        int[][] intervals = {{1, 3}, {2, 4}, {5, 7}, {6, 8}};
        MergeIntervalSolutions mergeIntervalSolutions = new MergeIntervalSolutions();
        List<int[]> mergedIntervals = mergeIntervalSolutions.merge(intervals);
        // Print the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
