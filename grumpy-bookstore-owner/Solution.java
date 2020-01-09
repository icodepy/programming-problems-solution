class Solution {
    public int maxSatisfied(int[] C, int[] G, int X) {
        int n = C.length, sumc=0, sumg=0, maxg=0,maxc=0, st=0, en=X-1;
        
        for(int i=0;i<X;i++)
            if(G[i]==1)
                sumc+=C[i];
        maxc=sumc;
        for(int i=X, j=0;i<n && j<n;i++, j++){
            if(G[j]==1)
                sumc-=C[j];
            if(G[i]==1)
                 sumc+=C[i];
            if(maxc<sumc){
                maxc=sumc;
                st=j+1;
                en=i;
            }
        }
        for(int i=0;i<n;i++)
            if((i<st || i>en) && G[i]==0) maxc+=C[i];
            else if(G[i]==0)maxc+=C[i];
        return maxc;
    }
}
