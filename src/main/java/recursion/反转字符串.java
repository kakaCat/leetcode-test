package recursion;

/**
 * @ClassName 反转字符串
 * @Description TODO
 * @Author yunp
 * @Date 2019/12/30 9:19
 * @Version 1.0
 **/
public class 反转字符串 {

    public static void main(String[] args) {
        char[] cs = new char[]{'h', 'e', 'l', 'l', 'o'};

        System.out.println(String.valueOf(cs));
    }


    public static void reverseString(char[] s) {
        int l = s.length;
        if(l<1){
            return;
        }
        doReverseString(s, l, 0);
    }
    public static void doReverseString(char[] s,int l,int i) {
        int end = l - i - 1;
        if(end<=i){
            return;
        }

        char temp = s[i];
        s[i] = s[end];
        s[end] = temp;
        doReverseString(s, l, ++i);
    }
}
