package leetcode391_400;

import java.util.Stack;

public class $394 {

    public static void main(String[] args) {
        String encodedStr = "3[a2[c]]";
        String decodedStr = decodeString(encodedStr);
        System.out.println(decodedStr);  // 输出: "aaabcbc"
    }

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String curString = "";
        int curNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                curNum = curNum * 10 + Character.getNumericValue(c);
            } else if (c == '[') {
                countStack.push(curNum);
                stringStack.push(curString);
                curNum = 0;
                curString = "";
            } else if (c == ']') {
                StringBuilder sb = new StringBuilder(stringStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    sb.append(curString);
                }
                curString = sb.toString();
            } else {
                curString += c;
            }
        }

        return curString;
    }
}
