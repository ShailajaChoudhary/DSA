class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                freq.put(nums[i][j],freq.getOrDefault(nums[i][j], 0) + 1);
            }
        }

        List<Integer> keys = new ArrayList<>(freq.keySet());
        for (int i = 0; i < keys.size(); i++) {
            int key = keys.get(i);
            if (freq.get(key) == nums.length) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;



    }
}