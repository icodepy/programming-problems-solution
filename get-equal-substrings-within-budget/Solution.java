class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int cost =0, maxl=0,l=0, n = s.length();
        //int a[] = new int[]{2,2,0,2,0,1,1,26,1,0,0,26,1,0,0,0,0};   // A Test Case
        //n= a.length;
        int a[] = new int[100001]; // using this array makes my code a little faster (from 10ms down to 8ms) but increases the space complexity by O(n)
        for(int i=0;i<n;i++) a[i] =  Math.abs((int)s.charAt(i) - (int)t.charAt(i));
        for(int i=0, j=i;i<=j && j<n;j++){  // O(n)
            int x = Math.abs((int)s.charAt(j) - (int)t.charAt(j));  // here you should use a[j] , in case using the above mentioned test case
            if(x>=maxCost){ 
                i=j+1;
                cost=0;
                l=0;
                if(x==maxCost)maxl = maxl<1?1:maxl;
            }
            else{
                if((x+cost)>maxCost)
                    while((i<j) && (x+cost)>maxCost)
                        cost-=a[i++]; 
                cost+=x;
                maxl = maxl < (j-i+1) ? (j-i+1) :maxl;
            }
        }
        return maxl;
    }
}