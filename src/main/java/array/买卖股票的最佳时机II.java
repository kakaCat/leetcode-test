package array;

public class 买卖股票的最佳时机II {

    public static void main(String[] args) {
        int[] num = {7,1,5,3,6,4};
        int max = maxProfit(num);
        System.out.println(max);
    }

    public static int maxProfit(int[] prices) {
        int max = 0 ;
        int size = prices.length;
        for(int i=0;i<size-1;++i){
            if(prices[i]<prices[i+1]){
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }

}
