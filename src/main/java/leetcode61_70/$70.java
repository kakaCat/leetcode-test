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

        int i = climbStairs3(4);
        System.out.println(i);
    }

    public static int climbStairs3(int n) {
        if(n==1){
            return 1;
        }
        int first =1 ,seconde =2;


        for (int i = 3; i <= n; i++) {
            int three = first + seconde;
            first = seconde;//fn(n-2)
            seconde = three;//fn(n-1)
        }
        return seconde;//fn(n) = fn(n-1) + fn(n-2)
    }

    public static int climbStairs2(int n) {
        int first = 0, seconde = 0, three = 1;
        for (int i = 1; i <= n; ++i) {
            first = seconde;//f(0)
            seconde = three;//f(1)
            three = first + seconde;//f(0) + fn(1)
        }
        return seconde;
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
