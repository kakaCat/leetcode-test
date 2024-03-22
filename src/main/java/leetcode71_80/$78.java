package leetcode71_80;

import java.util.ArrayList;
import java.util.List;

public class $78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4};
        List<List<Integer>> subsets = subsets(nums);

        System.out.println("所有子集：");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        generateSubsets(0, nums, subset, result);
        return result;
    }

    private static void generateSubsets(int index, int[] nums, List<Integer> subset, List<List<Integer>> result) {
        result.add(new ArrayList<>(subset));
        System.out.println(subset);
        for (int i = index; i < nums.length; i++) {
//            if (i > index && nums[i] == nums[i - 1]) {
//                continue; // 跳过重复元素
//            }

            subset.add(nums[i]);
            generateSubsets(i + 1, nums, subset, result);
            subset.remove(subset.size() - 1);
        }
    }



}
