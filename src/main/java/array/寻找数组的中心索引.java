package array;

/**
 * Created by JAVA on 2018/8/29.
 */
public class 寻找数组的中心索引 {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};


        System.out.println(pivotIndex(nums));


    }


    public static int pivotIndex(int[] nums){
        int length = nums.length;

        if (length <= 1) {
            return -1;
        }
        int sum = 0;
        int leftsum=0;
        int rightsum=0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }


        for (int i = 0; i < nums.length; i++) {
            if (i==0){
                leftsum = 0;
            }else {
                leftsum = leftsum + nums[i-1];
            }
            rightsum = sum - leftsum - nums[i];
            if (leftsum==rightsum){
                return i;
            }
        }





        return -1;
    }


}
