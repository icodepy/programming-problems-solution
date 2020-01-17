class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length(), i = n-1, j = i;
        int ans=0;
        if(n>0)ans=1;
        for(; i>-1 && j>-1 ; i-- ){
            if(map.get(s.charAt(i))==null)
                map.put(s.charAt(i), i);
            else{
                ans = Math.max(ans, (j-i));
                if(map.get(s.charAt(i)) <=j)
                    j = map.get(s.charAt(i))-1;
                map.put(s.charAt(i), i);
            }
            ans = Math.max(ans,(j-i)); 
        }
        ans=Math.max(ans,(j-i));
        return ans;
    }
}
