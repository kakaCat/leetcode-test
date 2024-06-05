package leetcode271_280;

import java.util.ArrayList;
import java.util.List;

public class $279 {

    public static void main(String[] args) {
        numSquares(5);
    }


    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                System.out.println( i-j*j);
                min = Math.min(min,dp[i-j*j]);
            }
            dp[i] = min+1;
            System.out.println("dp"+ dp[i]);
        }
        return dp[n];
    }

    public int method1(int n){
        //物品数组，所有小于等于n的完全平方数
        List<Integer> nums = new ArrayList<Integer>();
        int num = 1;
        while(num*num<=n){
            nums.add(num*num);
            num+=1;
        }
        int m = nums.size();//物品数量
        //dp[i][j]，在0到i个物品中选取，最少需要几个完全平方数表示j
        //放不下：dp[i][j]=dp[i-1][j]
        //放得下，选两种情况中更少的：放dp[i][j]=dp[i][j-nums[i]]+1，不放dp[i][j]=dp[i-1][j]
        int[][] dp = new int[m][n+1];
        for(int j=0;j<=n;j++){//初始化，只用物品0的情况
            if(j%nums.get(0)==0) dp[0][j] = j/nums.get(0);//整除nums[0]时，可以组成
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<=n;j++){
                if(j<nums.get(i)) dp[i][j] = dp[i-1][j];//放不下，继承
                else{//放得下，取不放和放中，更小的。dp[i][j-nums.get(i)]是因为可以重复选取
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-nums.get(i)]+1);
                }
            }
        }
        return dp[m-1][n];
    }
}
