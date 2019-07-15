package leetcode1l10;

public class $3 {

    public static void main(String[] args) {
        int a = lengthOfLongestSubstring("abcabcbb");
        System.out.println(a);
    }


    public static int lengthOfLongestSubstring(String s) {
        int[] m = new int[256];

        int res = 0, left = 0;

        for (int i = 0; i < s.length(); i++) {
            left = Math.max(left, m[s.charAt(i)]);
            System.out.println("res："+res);
            System.out.println("left："+left);
            System.out.println("left："+left);
            System.out.println(i - left + 1);
            res = Math.max(res, i - left + 1);
            System.out.println("endres："+res);
            m[s.charAt(i)] = i + 1;
        }
        return res;
    }


}
