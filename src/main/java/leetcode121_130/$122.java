package leetcode121_130;

public class $122 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        final int max = maxProfit(prices);
        System.out.println(max);
    }

    public static int maxProfit(int[] prices) {
        if(prices==null||prices.length==0||prices.length<2){
            return 0;
        }
        int len = prices.length;
        //现金
        int[] cash = new int[len];
        //股票
        int[] hold = new int[len];
        cash[0] = 0;
        hold[0] = -prices[0];
        int max = 0;
        for(int i=1;i<prices.length;i++){
            cash[i] = Math.max(cash[i-1],hold[i-1]+prices[i]);
            hold[i] = Math.max(hold[i-1],cash[i-1]-prices[i]);
        }
        return cash[len-1];
    }
}
