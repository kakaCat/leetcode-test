package leetcode281_290;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName $290
 * @Description 290. 单词规律
 * @Author yunp
 * @Date 2020/7/20 15:34
 * @Version 1.0
 **/
public class $290 {

    public static void main(String[] args) {


        String pattern = "abba";
        String str = "d cat cat dog";

        boolean b = wordPattern(pattern, str);


        System.out.println(b);
    }



    public static boolean wordPattern(String pattern, String str) {
        if (pattern == null && str == null) {
            return true;
        }
        if (pattern == null || str == null) {
            return false;
        }
        String[] word = str.split(" ");
        if (pattern.length() != word.length) {
            return false;
        }
        Map<Object, Integer> mem = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            Integer pi = mem.put(pattern.charAt(i), i);
            Integer si = mem.put(word[i], i);
            if (!Objects.equals(pi, si)) {
                return false;
            }
        }

        return true;

    }


}
