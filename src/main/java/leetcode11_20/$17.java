package leetcode11_20;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $17
 * @Description 17. 电话号码的字母组合
 * @Author yunp
 * @Date 2020/8/31 11:07
 * @Version 1.0
 **/
public class $17 {

    public static void main(String[] args) {


        List<String> strings = letterCombinations2("234");


        System.out.println(strings);
    }

    public static  String[] nums = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private static String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    private static ArrayList<String> res;

    public static List<String> letterCombinations(String digits) {

        res = new ArrayList<String>();
        if(digits.equals(""))
            return res;

        findCombination(digits, 0, "");
        return res;
    }

    private static void findCombination(String digits, int index, String s){
        //disgits 多长 组装的 字符就多长
        if(index == digits.length()){
            res.add(s);
            return;
        }

        Character c = digits.charAt(index);
        String letters = letterMap[c - '0'];
//        String letters = letterMap[index];
        for(int i = 0 ; i < letters.length() ; i ++){
            findCombination(digits, index+1, s + letters.charAt(i));
        }

        return;
    }




    public static List<String> letterCombinations2(String digits) {

        List<String> list = new ArrayList();
        if(digits == ""){
            return list;
        }
        String[] nums = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtracking2(0,digits,nums,"",list);
        return list;
    }

    public static void backtracking2(int index , String digits ,String[] nums ,String value,List<String> list){
        if(index == digits.length()){
            list.add(value);
            return;
        }
        Character c = digits.charAt(index);
        String letters = letterMap[c - '0'];
        for(int i = 0;i<letters.length();i++){
            backtracking2( index+1,digits,nums , value + letters.charAt(i),list);
        }


    }

}
