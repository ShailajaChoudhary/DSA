class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length()==0)
        {
            return 0;
        }
        int fix=0;
        int scroll=0;
        int winSize=0;
        int maxFreq=0;
        int maxWinSize=0;
        while(scroll<s.length())
        {
            map.put(s.charAt(scroll), map.getOrDefault(s.charAt(scroll), 0) + 1);
            winSize++;

            maxFreq = Collections.max(map.values());   
    
            int count=winSize-maxFreq;
            if(count>k)
            {
                map.put(s.charAt(fix), map.get(s.charAt(fix)) - 1);
                fix++;
                winSize--;
            }
            maxWinSize=Math.max(maxWinSize,winSize);
            scroll++;
            
        }
        return maxWinSize;
    }
}