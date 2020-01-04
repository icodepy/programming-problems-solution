class Solution { // Amir
    public int maxProfit(int[] a) {
        int n = a.length, max=0;
        for(int i=n-1, j = i; i>-1 && j>-1 ; ){
            if(i==j)i--;
            if(i>-1 && j>-1)
             max = max< (a[j]-a[i])? (a[j]-a[i]) : max;
            else break;
            if(a[i]<=a[j])i--;
            else if(a[i]>a[j])j--;            
         }
           return max;
        }
        
    
}