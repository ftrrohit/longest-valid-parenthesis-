import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String input = sc.nextLine().trim();
            System.out.println(longestValidParentheses(input));
        }
        sc.close();
    }
}
