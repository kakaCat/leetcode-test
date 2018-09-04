package array;

/**
 * Created by JAVA on 2018/8/29.
 */
public class 至少是其他数字两倍的最大数 {

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};

        System.out.println(dominantIndex(nums));

    }

    public static int dominantIndex(int[] nums) {

        if (nums.length < 2) {
            return -1;
        }


        int max1 = 0;
        int max2 = 0 ;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {

           if(nums[i]>max1){
               max2 = max1;
               max1 = nums[i];
               index = i;
           }else if(nums[i]>max2){
               max2 = nums[i];
           }

        }
        


        return max1 >= max2*2 ? index : -1;
    }


}
