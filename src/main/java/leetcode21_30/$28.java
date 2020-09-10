package leetcode21_30;

/**
 * @ClassName $28
 * @Description 实现 strStr()
 * @Author yunp
 * @Date 2020/8/26 16:31
 * @Version 1.0
 **/
public class $28 {

    public static void main(String[] args) {

        String haystack = "hello", needle = "ll";

        int i = strStr(haystack, needle);

        System.out.println(i);
    }

    public static int strStr(String haystack, String needle) {

        int l1 = haystack.length() , l2 = needle.length();

        if(l1<=0||l1<l2){
            return -1;
        }

        for(int i =0 ;i<l1-l2+1;++i){
            if(haystack.substring(i,i+l2).equals(needle) ){
                return i;
            }

        }

        return -1;
    }
}
