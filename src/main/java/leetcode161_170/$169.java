package leetcode161_170;

import java.util.HashMap;
import java.util.Map;

public class $169 {

    public static void main(String[] args) {
       int[] nums = {3,2,3};
        final int i = majorityElement(nums);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        map.put(nums[0],1);
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(max)<map.get(nums[i])){
                max = nums[i];
            }
        }
        return max;
    }

}
