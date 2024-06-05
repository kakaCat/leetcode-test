package leetcode231_240;

import java.util.LinkedList;

public class $239 {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        final int[] ints = maxSlidingWindow2(nums, 3);
        System.out.println(ints);

    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k == 0)
            return new int[0];
        int n = nums.length;
        // 使用双端队列，方便收尾进出
        LinkedList<Integer> indexQueue = new LinkedList<>();
        indexQueue.offer(0);
        //1.先找k内的最大值
        for(int i = 1; i < k; i++) {
            //把有可能成为窗口中最大值的元素下标入队
            while(!indexQueue.isEmpty() && nums[i] > nums[indexQueue.getLast()]) {
                indexQueue.removeLast();
            }
            indexQueue.addLast(i);
        }
        LinkedList<Integer> res = new LinkedList<>();
        res.add(nums[indexQueue.getFirst()]);
        for(int i = k; i < n; ++i) {
            while(!indexQueue.isEmpty() && nums[i] > nums[indexQueue.getLast()]) {
                indexQueue.removeLast();
            }
            indexQueue.addLast(i);
            if(i - indexQueue.getFirst() >= k) {
                indexQueue.removeFirst();
            }
            res.add(nums[indexQueue.getFirst()]);
        }

        int[] result = new int[res.size()];
        for(int i = 0; i < result.length; ++i) {
            result[i] = res.removeFirst();
        }
        return result;
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int r = k-1;
        int[] ans = new int[nums.length-k+1];
        for(int i=0;i<=nums.length-k;i++){
            ans[i] = getMax(nums,i,r++);
        }
        return ans;
    }

    public static int getMax(int[] nums,int l,int r){
        int max = Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            max = Math.max(nums[i],max);
        }
        return max;
    }
}
