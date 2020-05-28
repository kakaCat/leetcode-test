
package leetcode1_10;

import java.util.HashMap;
import java.util.Map;

public class $1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        int target = 9;

        int[] ints = twoSum(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] b = new int[2];
        for(int i =0 ;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target == nums[i]+nums[j]){
                    b[0] = nums[i];
                    b[1] = nums[j];
                    break;
                }
            }

        }
        return b;
    }


    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] ints = new int[2];
        for(int i =0 ;i<nums.length;i++){
            int result = target - nums[i];
            if(map.containsKey(result)){
                ints[0] = map.get(result);
                ints[1] = i;
                return ints;
            }
            map.put(nums[i], i);
        }

        return new int[2];
    }

}
