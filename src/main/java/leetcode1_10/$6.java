package leetcode1_10;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $6
 * @Description 6. Z 字形变换
 * @Author yunp
 * @Date 2020/8/31 14:42
 * @Version 1.0
 **/
public class $6 {


    public static void main(String[] args) {

        String s = convert("LEETCODEISHIRING", 3);


        System.out.println(s);
    }


    public static String convert(String s, int numRows) {
        if(numRows<=1){
            return s;
        }

        List<StringBuffer> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuffer());
        }
        char[] chars = s.toCharArray();

        int index  = 0 , fast = -1;

        for (char c : chars) {
            list.get(index).append(c);

            if(index == 0||index == numRows -1){
                fast = -fast;
            }
            index+=fast;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuffer sb : list) {
            res.append(sb);
        }
        return res.toString();


    }


}
