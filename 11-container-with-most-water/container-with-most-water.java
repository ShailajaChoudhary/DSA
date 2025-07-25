class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=Integer.MIN_VALUE;
        while(left<right)
        {
            if(height[left]>height[right])
            {
                int area =height[right]*(right-left);
                max=Math.max(area,max);
                right--;
            }
            else
            {
                int area =height[left]*(right-left);
                max=Math.max(area,max);
                left++;
            }
        }
        return max;
    }
}