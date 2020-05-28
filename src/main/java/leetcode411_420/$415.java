package leetcode411_420;

/**
 * @ClassName $415
 * @Description 415. 字符串相加
 * @Author yunp
 * @Date 2020/5/28 11:21
 * @Version 1.0
 **/
public class $415 {

    public static void main(String[] args) {
        String s = addStrings("10000", "123455");
        System.out.println(s);
    }


    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = n1 + n2 + carry;
            carry = tmp / 10;
            res.append(tmp % 10);
            i--; j--;
        }
        if(carry == 1) res.append(1);
        return res.reverse().toString();
    }



}
