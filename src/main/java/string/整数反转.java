package string;

public class 整数反转 {

    public static void main(String[] args) {
        int nums = 120;
        int reverse = reverse(nums);
        System.out.println(reverse);
    }

    public static int reverse(int n) {
        /** 结果 */
        int res = 0;
        while (n != 0) {
            /** 上次结果 向前移位 n留个位*/
            int t = res * 10 + n % 10;
            if (t / 10 != res) {return 0;}
            /** 转换 */
            res = t;
            /** 降位 */
            n /= 10;
        }
        return res;
    }

}
