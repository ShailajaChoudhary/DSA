// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(1);
        for(int i=2;i<=n;i++)
        {
            int carry=0;
            for(int j=0;j<ans.size();j++)            
            {
                int product=ans.get(j)*i;
                product+=carry;
                ans.set(j, product % 10);
                carry=product/10;
            }
            
            while(carry!=0)
            {
                ans.add(carry%10);
                carry=carry/10;
            }
            
        }
        Collections.reverse(ans);
        return ans;
    }
}