class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        HashSet<Character> ans = new HashSet<>();
        if(s.length()==0)
        {
            return 0;
        }
        int left=0;
        int right=0;
   
        while(right<s.length())
        {
            int i=right;
            if (!ans.contains(s.charAt(i)))
            {
                ans.add(s.charAt(i));
                max=Math.max(right-left+1,max);
                right ++;
            }
            else
            {
                ans.remove(s.charAt(left));
                left++;
            }
        }
        
        return max;
    }
}