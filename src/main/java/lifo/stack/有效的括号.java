package lifo.stack;

import java.util.Stack;

public class 有效的括号 {

    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(')');
            }else if (aChar == '{'){
                stack.push('}');
            } else if (aChar == '['){
                stack.push(']');
                /** 验证 */
            } else if (stack.isEmpty() || stack.pop() != aChar){
                return false;
            }
        }
        return stack.isEmpty();
    }

}
