package leetcode41_50;

import java.util.ArrayList;
import java.util.List;

public class $46 {

    public static void main(String[] args) {
        $46 permutations = new $46();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutations.permute(nums);
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) {
                    continue; // 跳过已经添加过的元素
                }
                tempList.add(nums[i]);
                backtrack(result, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }



}
