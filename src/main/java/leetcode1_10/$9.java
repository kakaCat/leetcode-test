package leetcode1_10;

/**
 * @ClassName $9
 * @Description 9. 回文数
 * @Author yunp
 * @Date 2020/7/14 9:36
 * @Version 1.0
 **/
public class $9 {

    public static void main(String[] args) {

        isPalindrome(12321);

        isPalindrome(123321);
    }


    public static boolean isPalindrome(int x) {

        if (x<0 || x%10==0&&x!=0) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。

        boolean b = x == revertedNumber;
        boolean b1 = x == revertedNumber / 10;
        return  true;

    }


}
