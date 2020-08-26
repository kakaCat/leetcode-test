package leetcode441_450;

/**
 * @ClassName $443
 * @Description 443. 压缩字符串
 * @Author yunp
 * @Date 2020/7/17 11:08
 * @Version 1.0
 **/
public class $443 {

    public static void main(String[] args) {


        char[] chars = new char[]{'a','b','b','b','c','c','c'};

        int compress = compress(chars);

        System.out.println(compress);

    }


    public static int compress(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;

    }

}
