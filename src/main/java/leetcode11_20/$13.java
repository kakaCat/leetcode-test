package leetcode11_20;

import java.util.HashMap;
import java.util.Map;

public class $13 {
    public static void main(String[] args) {
        int i = romanToInt("IX");
        System.out.println(i);
    }



//    字符          数值
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
    public static Map<Character,Integer> getInitValue(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
//        map.put("IV", 4);
        map.put('V', 5);
//        map.put("IX", 9);
        map.put('X', 10);
//        map.put("XL", 40);
        map.put('L', 50);
//        map.put("XC", 90);
        map.put('C', 100);
//        map.put("CD", 400);
        map.put('D', 500);
//        map.put("CM", 900);
        map.put('M', 1000);
        return map;
    }

    public static int romanToInt(String s) {
        Map<Character,Integer> map = getInitValue();
        char[] chars = s.toCharArray();

        int result =0;
        Character be = null;
        Character af = null;
        for (int i = 0; i <chars.length; i++) {


            if(i==0){
                be = chars[i];
                Integer beValue = map.get(be);
                result += beValue;
            }else {
                af = chars[i];
                Integer beValue = map.get(be);
                Integer afValue = map.get(af);
                if(beValue>=afValue){
                    result += afValue;
                }else {
                    result += (afValue - 2*beValue);
                }
                be = af;
            }
        }

        return result;

    }

}
