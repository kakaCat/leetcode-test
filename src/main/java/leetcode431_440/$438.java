package leetcode431_440;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $438 {

    public static void main(String[] args) {
       String  s = "cbaebabacd", p = "abc";

        findAnagrams(s,p);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList();
        ans.contains(1);
        int len = p.length();
        p = getSort(p);
        for(int i=0;i<s.length()-len;i++){
            String t = s.substring(i,i+len);
            t = getSort(t);
            if(p.equals(t)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static String getSort(String p){
        char[] t = p.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
}
