/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String x_str = String.valueOf(x);
        int length = x_str.length();

        for(int i = 0; i < length/2; i++){
            if(x_str.charAt(i) != x_str.charAt(length - i -1) ){
                return false;
            }
            
        }
        return true;
    }
}
// @lc code=end

