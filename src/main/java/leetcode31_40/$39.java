package leetcode31_40;

import java.util.*;

/**
 * @ClassName $39
 * @Description 39. 组合总和
 * @Author yunp
 * @Date 2020/7/15 9:35
 * @Version 1.0
 **/
public class $39 {


    public static void main(String[] args) {

        int[] nums = {10,1,2,7,6,1,5};

        List<List<Integer>> lists = combinationSum(nums, 8);


        System.out.println(lists);
    }



    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;

        // 排序是为了提前终止搜索
        Arrays.sort(candidates);

        dfs(candidates, len, target, 0, new ArrayDeque<>(), res);
        return res;
    }

    /**
     * @param candidates 数组输入
     * @param len        输入数组的长度，冗余变量
     * @param residue    剩余数值
     * @param begin      本轮搜索的起点下标
     * @param path       从根结点到任意结点的路径
     * @param res        结果集变量
     */
    private static void dfs(int[] candidates,
                     int len,
                     int residue,
                     int begin,
                     Deque<Integer> path,
                     List<List<Integer>> res) {


        // 符合条件的
        if (residue == 0) {
            // 由于 path 全局只使用一份，到叶子结点的时候需要做一个拷贝
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; i++) {

            // 在数组有序的前提下，剪枝
            if (residue - candidates[i] < 0) {
                break;
            }
            path.addLast(candidates[i]);
            dfs(candidates, len, residue - candidates[i], i+1, path, res);
            //清空分支
            path.removeLast();

        }
    }



    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null) return res;
        int len = candidates.length;
        if (len == 0) return res;
        Arrays.sort(candidates);
        int[] nums = new int[len];
        dfs2(res, candidates, nums, 0, target, 0, len);
        return res;
    }

    public static void dfs2(List<List<Integer>> res, int[] candidates, int[] nums, int index, int target, int sum, int len) {
        if (sum == target) {
            List<Integer> content = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if (nums[i] != 0) {
                    int tmp = nums[i];
                    while (tmp-- != 0){
                        content.add(candidates[i]);
                    }
                }
            }
            res.add(content);
            return;
        }
        for (int i = index; i < len; i++) {
            if (sum + candidates[i] <= target) {
                nums[i]++;
                dfs2(res, candidates, nums, i, target, sum + candidates[i], len);
                nums[i]--;
            }
        }
    }


}
