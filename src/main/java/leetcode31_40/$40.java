package leetcode31_40;

import java.util.*;

/**
 * @ClassName $40
 * @Description 40. 组合总和 II
 * @Author yunp
 * @Date 2020/7/15 11:25
 * @Version 1.0
 **/
public class $40 {

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

            // 小剪枝
            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }





            path.addLast(candidates[i]);
            dfs(candidates, len, residue - candidates[i], i+1, path, res);
            //清空分支
            path.removeLast();

        }
    }

    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);  //先排序
        help(0, new ArrayList<Integer>(), target, candidates, 0);
        return ret;
    }
    public void help(int i, List<Integer> oneSolve, int target, int[] candidates, int sum){
        if (sum == target){
            ret.add(new ArrayList<>(oneSolve));
            return;   //exit_1
        }

        for (; i < candidates.length; ) {
            if (sum + candidates[i] <= target){
                oneSolve.add(candidates[i]);
                help(i+1, oneSolve, target, candidates, sum+candidates[i]);
                //跳过重复的元素
                while ((i+1) < candidates.length && candidates[i] == candidates[i+1])
                    i++;

                //这个 i++ 是为了能从下一个元素继续递归，每次成功返回（exit_1）或者
                //失败（exit_2）后都会加1，以便从后一个元素继续开始
                i++;
                oneSolve.remove(oneSolve.size()-1);
            } else{
                break;   //exit_2
            }
        }
    }

}
