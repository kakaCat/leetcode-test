package leetcode201_210;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName $205
 * @Description 205. 同构字符串
 * @Author yunp
 * @Date 2020/7/20 17:13
 * @Version 1.0
 **/
public class $205 {

    public static void main(String[] args) {


        boolean isomorphic = isIsomorphic3("egg", "add");


        System.out.println(isomorphic);

    }




    public static boolean isIsomorphic(String s, String t) {



        Map<Character, Character> mem1 = new HashMap<>();
        Map<Character, Character> mem2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(mem1.containsKey(s.charAt(i))){
                if(mem1.get(s.charAt(i))!=t.charAt(i)){
                   return false;
                }

            }else {
                mem1.put(s.charAt(i), t.charAt(i));
                if(mem1.containsKey(t.charAt(i))){
                    return false;
                }
                mem2.put(t.charAt(i), s.charAt(i));
            }

        }
        return true;



    }


    public boolean isIsomorphic2(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if(s.indexOf(ch1[i]) != t.indexOf(ch2[i])){
                return false;
            }
        }
        return true;
    }


    public static boolean isIsomorphic3(String s, String t) {
        int n = s.length();
        int[] mapS = new int[128];
        int[] mapT = new int[128];
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            //当前的映射值是否相同
            System.out.println(mapS[c1]);
            System.out.println(mapT[c2]);
            if (mapS[c1] != mapT[c2]) {
                return false;
            } else {
                //是否已经修改过，修改过就不需要再处理
                if (mapS[c1] == 0) {
                    mapS[c1] = i + 1;
                    mapT[c2] = i + 1;
                }
            }
        }
        return true;



    }

}
