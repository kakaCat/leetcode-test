package leetcode51_60;

/**
 * @ClassName $58
 * @Description 最后一个单词的长度
 * @Author yunp
 * @Date 2020/4/14 17:23
 * @Version 1.0
 **/
public class $58 {

    public static void main(String[] args) {

        String s  = "Hello World";

    }

    public static int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' '){
            end--;
        }
        if(end < 0){
            return 0;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;


    }

    public static int lengthOfLastWord2(String s) {
        s = s.trim();
        int num = s.length() -1 - s.lastIndexOf(" ");
        return num;


    }


}
