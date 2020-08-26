package leetcode31_40;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $38
 * @Description  外观数列
 * @Author yunp
 * @Date 2020/4/14 17:18
 * @Version 1.0
 **/
public class $38 {

    public static void main(String[] args) {
        int n = 5;

         String s = countAndSay2(5);

        System.out.println(s);

    }


    public static String countAndSay(int n) {
        StringBuilder s = new StringBuilder();
        int p1 = 0;
        int cur = 1;
        if ( n == 1 )
            return "1";
        String str = countAndSay(n - 1);
        for ( cur = 1; cur < str.length(); cur++ ) {
            if ( str.charAt(p1) != str.charAt(cur) ) {// 如果碰到当前字符与前面紧邻的字符不等则更新此次结果
                int count = cur - p1;
                s.append(count).append(str.charAt(p1));
                p1 = cur;
            }
        }
        if ( p1 != cur ){// 防止最后一段数相等，如果不等说明p1到cur-1这段字符串是相等的
            int count = cur - p1;
            s.append(count).append(str.charAt(p1));
        }
        return s.toString();
    }

    public static String countAndSay2(int n) {
        StringBuilder ans = new StringBuilder();
        ans.append("1");
        for (int i = 2; i <= n ; i++) {
            //遍历前一个字符串
            String currentStr = new String(ans);
            ans.delete(0,ans.length());
            int num = 0;
            char currentChar = currentStr.charAt(0);
            for (char c : currentStr.toCharArray()) {
                if(c == currentChar){
                    num++;
                }
                else{
                    ans.append((char)('0'+num));
                    ans.append(currentChar);
                    currentChar = c;
                    num = 1;
                }
            }
            ans.append((char)('0'+num));
            ans.append(currentChar);

        }

        return ans.toString();
    }



}
