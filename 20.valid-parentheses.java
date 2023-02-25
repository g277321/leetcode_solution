import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        int s_length = s.length();
        if (s_length%2 !=0) {
            return false;
        } else {
            Stack<Character> stack = new Stack<>();
            for(char i : s.toCharArray())
            if(i=='{' || i=='(' || i=='[' )
                stack.push(i);
            else{
                if(stack.empty() 
                 || (i==')' && stack.peek()!='(')
                 || (i=='}' && stack.peek()!='{') 
                 || (i==']' && stack.peek()!='[') ) 
                return false;
                stack.pop();
            }
        return stack.empty();
        }
    }
}
// @lc code=end

