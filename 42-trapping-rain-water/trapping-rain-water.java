class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefix = new int[n];
        prefix[0]=height[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        
        int[] suffix = new int[n];
        suffix[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }


        int leftMax=0;
        int rightMax=0;
        int ans=0;

        for(int i=0;i<n;i++)
        {
            leftMax=prefix[i];
            rightMax=suffix[i];
            if(height[i]<leftMax&&height[i]<rightMax)
            {
                ans+=Math.min(leftMax,rightMax)-height[i];
            }
        }
        return ans;
    }
}