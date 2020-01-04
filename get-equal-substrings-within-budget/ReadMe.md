problem link -  https://leetcode.com/problems/get-equal-substrings-within-budget/
link to my discussion section - https://leetcode.com/problems/get-equal-substrings-within-budget/discuss/469735/A-simple-solution

In the Solution code I have used an array to store the differences of the chars in the two strings which though increases the complexity by O(n) but improves the TC from 10ms down to 7ms.

If you don't want to use an extra space then rewrite the code in the while loop as follows
(my TC raised to 10ms with this code):
   "
                    while((i<j) && (x+cost)>maxCost){
                          cost-=Math.abs((int)s.charAt(i) - (int)t.charAt(i)); 
						  i++;
				   }
  "



TC - O(n)
SC - O(n) - but can be improved to O(1) as stated above
Technique - two pointer or sliding window