package leetcode121_130;

/**
 * @ClassName $125
 * @Description 125. 验证回文串
 * @Author yunp
 * @Date 2020/9/9 10:09
 * @Version 1.0
 **/
public class $125 {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String s) {

        if(s == null||s.length()==0){
            return true;
        }
        int left = 0 , right = s.length()-1;
        while(left<right){

            while (left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;

            right--;
        }
        return true;
    }
}
