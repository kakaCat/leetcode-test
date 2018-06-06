package test;

/**
 * Created by JAVA on 2018/5/27.
 */
public class TwoSum {

    public static void main(String[] args) {
        int [] nums={2, 7, 11, 15};


    }
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((nums[i] + nums[j])== target) {

                    result[0] = i;
                    result[1] = j;

                    return result;
                }

            }

        }
        return result;
    }






}
