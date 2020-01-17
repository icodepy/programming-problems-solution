Link to the pronlem - https://leetcode.com/problems/longest-substring-without-repeating-characters
Link to my solution - https://leetcode.com/submissions/detail/295009974/

technique - sliding window

I have solved this problem using two pointers sliding window technique and a hashmap to store key/value pairs. 

catch point - when there's a repeating char at ith index, I am updating j only when i<=j bcs we don;t need to consider the chars beyond index j as "already visited". 

Note - the code is not meant for some newbie. 
tc - O(n)
space complexity - O(number of unique chars in the string<=128)

