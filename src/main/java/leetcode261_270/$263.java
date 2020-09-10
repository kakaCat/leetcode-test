package leetcode261_270;

/**
 * @ClassName $263
 * @Description 263. 丑数
 * @Author yunp
 * @Date 2020/9/9 14:26
 * @Version 1.0
 **/
public class $263 {

    public static void main(String[] args) {

    }


    public boolean isUgly(int num) {

        //需要特判0
        if (num < 1) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;


    }


}
