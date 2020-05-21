package leetcode381_390;

/**
 * @ClassName $389
 * @Description 389. 找不同
 * @Author yunp
 * @Date 2020/4/23 14:56
 * @Version 1.0
 **/
public class $389 {


    public static void main(String[] args) {
        String s= "abcd";
        String t= "abcde";

        char r = findTheDifference(s, t);

        System.out.println( r);

    }


    public static char findTheDifference(String s, String t) {
        int len = s.length();

        char res = 0;
        for (int i = 0; i <len ; i++) {
            res ^= s.charAt(i) ^ t.charAt(i);
        }
        res ^= t.charAt(len);
        return res;
    }


}
