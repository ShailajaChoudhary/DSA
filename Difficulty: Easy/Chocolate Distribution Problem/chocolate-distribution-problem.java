// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int n=arr.size();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n-m;i++)
        {
            min=Math.min(min,arr.get(i+m-1)-arr.get(i));
        }
        return min;
        
    }
}