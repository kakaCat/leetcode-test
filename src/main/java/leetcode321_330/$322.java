package leetcode321_330;

import java.util.Arrays;

public class $322 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};  int amount = 11;
        coinChange(coins,amount);
    }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        int init =  coins[0];
        for (int i = init; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }


}
