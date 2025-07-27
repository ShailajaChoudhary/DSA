class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result=new int[intervals.length+1][2] ;
        int i=0;
        int j=0;
        int n=intervals.length;
        while(i<n&&intervals[i][1]<newInterval[0])
        {
            result[j++]=intervals[i++];
        }
        while(i<n&&intervals[i][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i++][1],newInterval[1]);
        }
        result[j++]=newInterval;
        while(i<n)
        {
            result[j++]=intervals[i++];
        }
        return Arrays.copyOf(result,j);

    }
}