import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 0) {
            return intervals;
        }

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        int[] savedinterval = intervals[0];
        ans.add(savedinterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] currinterval = intervals[i];

            if (savedinterval[1] >= currinterval[0]) {
                // Merge the intervals
                savedinterval[1] = Math.max(savedinterval[1], currinterval[1]);
            } else {
                savedinterval = currinterval;
                ans.add(savedinterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
