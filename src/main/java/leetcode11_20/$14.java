package leetcode11_20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $14
 * @Description 最长公共前缀
 * @Author yunp
 * @Date 2020/4/10 11:04
 * @Version 1.0
 **/
public class $14 {

    public static void main(String[] args) {

        String[] arr = new String[]{"flower","flow","flight"};
        String s = longestCommonPrefix(arr);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for (int i=0,len=strs.length;i<len;i++){

            //是否有子串
            while (strs[i].indexOf(prefix) != 0) {
                //获取从后到前的长度
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }


}
