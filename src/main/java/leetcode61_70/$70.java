package leetcode61_70;

/**
 * @ClassName $70
 * @Description 70. 爬楼梯
 * @Author yunp
 * @Date 2020/5/21 16:27
 * @Version 1.0
 **/
public class $70 {

    public static void main(String[] args) {

        int i = climbStairs(8);
        System.out.println(i);

    }

    public static int climbStairs(int n) {
        return doClimbStairs(0, n);
    }

    public static int doClimbStairs(int i,int n) {

        if(i>n){
            return 0;
        }

        if(i==n){
            return 1;
        }
        return doClimbStairs(i+1,n)+doClimbStairs(i+2,n);
    }

}
