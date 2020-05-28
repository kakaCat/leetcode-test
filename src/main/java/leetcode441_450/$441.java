package leetcode441_450;

/**
 * @ClassName $441
 * @Description 441. 排列硬币
 * @Author yunp
 * @Date 2020/5/21 14:48
 * @Version 1.0
 **/
public class $441 {


    public static void main(String[] args) {

        int i = arrangeCoins(5);

        System.out.println(i);
    }


    public static int arrangeCoins(int n) {

        int i=1;
        while(n>=i){
            n-=i++;
        }
        return i-1;
    }


}
