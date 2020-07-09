package leetcode1_10;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $3
 * @Description 3. 无重复字符的最长子串
 * @Author yunp
 * @Date 2020/5/28 14:24
 * @Version 1.0
 **/
public class $3 {

    public static void main(String[] args) {

        int a = lengthOfLongestSubstring("abcabcbb");

        System.out.println(a);

    }


    public static int lengthOfLongestSubstring(String s) {

        if (s.length()==0) return 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }


}
