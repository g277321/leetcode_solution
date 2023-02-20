/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            int current_num = getValue(s.charAt(i));
            if (preNum < current_num){
                sum = sum - preNum;
            } else {
                sum = sum + preNum;
            }
            preNum = current_num;
        }
        sum = sum + preNum;
        return sum;
    }
    private int getValue(char single_roman){
        switch (single_roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:
                return 0;
        }
    }
}
// @lc code=end

