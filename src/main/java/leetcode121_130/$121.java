package leetcode121_130;

/**
 * @ClassName $121
 * @Description 121. 买卖股票的最佳时机
 * @Author yunp
 * @Date 2020/7/14 10:07
 * @Version 1.0
 **/
public class $121 {

    public static void main(String[] args) {
        String str ="";
//        str.substring()
        int[] nums1 = {7,1,5,3,6,4};
        int i = maxProfit(nums1);
        System.out.println(i);
    }


    public static int maxProfit(int[] prices) {

        int maxProfit = 0;

        int min = Integer.MAX_VALUE;



        for(int i =0;i<prices.length;i++){

            if(prices[i]<min){
                min =prices[i];
            }else if(prices[i]-min>maxProfit){
                maxProfit = prices[i] - min;
            }
        }

        return maxProfit;

    }





}
