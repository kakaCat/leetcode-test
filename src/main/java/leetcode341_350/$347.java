package leetcode341_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $347 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] topKFrequentElements = topKFrequent(nums, k);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] arr = new List[nums.length+1];
        for(int key : map.keySet()){
            int i = map.get(key);
            if(arr[i]==null){
                arr[i]=new ArrayList();
            }
            arr[i].add(key);
        }
        int[] ans =new int[k];
        int idx = k;
        for(int i=arr.length-1;i>=0&& idx >0;i--){
            if(arr[i] == null){
                continue;
            }
            for (Integer v : arr[i]) {
                ans[--idx] = v;
            }

        }
        return ans;
    }
}
